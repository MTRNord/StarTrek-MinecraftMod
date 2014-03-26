package mtrnord.StarTreckMod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class Blocks extends Block{

	public Blocks(int id, Material mat) {
		super(id, mat);
	}
		
	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("startreckmod:" + this.blockID);

	}
	
	public int idDropped(int i, Random rand, int j){
		return this.blockID;
	}
		
		
	

}
