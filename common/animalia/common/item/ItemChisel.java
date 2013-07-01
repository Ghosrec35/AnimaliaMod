package animalia.common.item;

import animalia.common.Animalia;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;

public class ItemChisel extends ItemTool
{
	public ItemChisel(int par1, EnumToolMaterial par3EnumToolMaterial) 
	{
		super(par1, 2, par3EnumToolMaterial, new Block[]{Animalia.fossilBlock});
	}
}
