package wildcraft.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import wildcraft.core.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;

public class TanneryRecipes
{
    private static final TanneryRecipes smeltingBase = new TanneryRecipes();
    /** The list of smelting results. */
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();

    /**
     * Used to call methods addSmelting and getSmeltingResult.
     */
    public static TanneryRecipes smelting()
    {
        return smeltingBase;
    }

    private TanneryRecipes()
    {
      
        this.smelt(ModItems.pelt, new ItemStack(Items.leather), 0F);

    }

    public void blockSmelt(Block block, ItemStack stack, float var1)
    {
        this.smelt(Item.getItemFromBlock(block), stack, var1);
    }

    public void smelt(Item item, ItemStack stack, float var1)
    {
        this.readSmelt(new ItemStack(item, 1, 32767), stack, var1);
    }

    public void readSmelt(ItemStack stack, ItemStack stackResult, float i)
    {
        this.smeltingList.put(stack, stackResult);
        this.experienceList.put(stackResult, Float.valueOf(i));
    }

    /**
     * Returns the smelting result of an item.
     */
    public ItemStack getSmeltingResult(ItemStack stack)
    {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.checkSmelt(stack, (ItemStack)entry.getKey()));

        return (ItemStack)entry.getValue();
    }

    private boolean checkSmelt(ItemStack stack, ItemStack stackResult)
    {
        return stackResult.getItem() == stack.getItem() && (stackResult.getItemDamage() == 32767 || stackResult.getItemDamage() == stack.getItemDamage());
    }

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }

    public float giveXP(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;

        Iterator iterator = this.experienceList.entrySet().iterator();
        Entry entry;

        do
        {
            if (!iterator.hasNext())
            {
                return 0.0F;
            }

            entry = (Entry)iterator.next();
        }
        while (!this.checkSmelt(stack, (ItemStack)entry.getKey()));

        return ((Float)entry.getValue()).floatValue();
    }
}