package wildcraft.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemMotar extends Item{
	public ItemMotar()
	{
		super();
		this.maxStackSize = 1;
		this.setMaxDamage(25);
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack)
	{
		
			return stack.getItemDamage()<24;
		
	}
	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack)
	{
		return false;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemStack)
	{
		ItemStack cStack = itemStack.copy();
		cStack.setItemDamage(cStack.getItemDamage() + 1);
		cStack.stackSize = 1;
		return cStack;
	}
}
