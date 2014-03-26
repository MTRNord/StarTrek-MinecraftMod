package mtrnord.StarTreckMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class StarTreckItemPickaxe extends ItemPickaxeStarTreckMod{

	public StarTreckItemPickaxe(int ID, EnumToolMaterialStarTreck material) {
		super(ID, material);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("startreckmod:" + this.itemID);
	}
	
	
}
