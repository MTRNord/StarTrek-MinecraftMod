package mtrnord.StarTreckMod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class Generator implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
        case -1:
            generateNether(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 0:
            generateSurface(world, random, chunkX * 16, chunkZ * 16);
            break;
        case 1:
            generateEnd(world, random, chunkX * 16, chunkZ * 16);
            break;
        }
	}

	private void generateEnd(World world, Random random, int i, int j) {}

	private void generateSurface(World world, Random random, int i, int j) {
		
		for(int k = 0; k < 10; k++) {
			int XCoord = i + random.nextInt(16);
			int YCoord = random.nextInt(64);
			int ZCoord = j + random.nextInt(16);
			
			(new WorldGenMinable(StarTreckMod.titaniumOre.blockID, 0)).generate(world, random, XCoord, YCoord, ZCoord);
		}
	}

	private void generateNether(World world, Random random, int i, int j) {}
}



