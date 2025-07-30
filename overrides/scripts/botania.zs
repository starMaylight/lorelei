import crafttweaker.item.IItemStack;
/*import mods.botania.Apothecary;
import mods.botania.ElvenTrade;
import mods.botania.ManaInfusion;
import mods.botania.Orechid;
import mods.botania.OrechidIgnem;
import mods.botania.PureDaisy;
import mods.botania.RuneAltar;
import mods.botaniatweaks.Agglomeration;*/
import crafttweaker.item.IIngredient;
val remove =
[
    <botania:petalblock:0>,
    <botania:petalblock:1>,
    <botania:petalblock:2>,
    <botania:petalblock:3>,
    <botania:petalblock:4>,
    <botania:petalblock:5>,
    <botania:petalblock:6>,
    <botania:petalblock:7>,
    <botania:petalblock:8>,
    <botania:petalblock:9>,
    <botania:petalblock:10>,
    <botania:petalblock:11>,
    <botania:petalblock:12>,
    <botania:petalblock:13>,
    <botania:petalblock:14>,
    <botania:petalblock:15>,
    
]
 as IItemStack[];

for item in remove {
recipes.remove(item);
}

mods.rustichromia.HayCompactor.add("petalblock_0",[<botania:petal:0>*9],[<botania:petalblock:0>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_1",[<botania:petal:1>*9],[<botania:petalblock:1>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_2",[<botania:petal:2>*9],[<botania:petalblock:2>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_3",[<botania:petal:3>*9],[<botania:petalblock:3>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_4",[<botania:petal:4>*9],[<botania:petalblock:4>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_5",[<botania:petal:5>*9],[<botania:petalblock:5>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_6",[<botania:petal:6>*9],[<botania:petalblock:6>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_7",[<botania:petal:7>*9],[<botania:petalblock:7>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_8",[<botania:petal:8>*9],[<botania:petalblock:8>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_9",[<botania:petal:9>*9],[<botania:petalblock:9>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_10",[<botania:petal:10>*9],[<botania:petalblock:10>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_11",[<botania:petal:11>*9],[<botania:petalblock:11>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_12",[<botania:petal:12>*9],[<botania:petalblock:12>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_13",[<botania:petal:13>*9],[<botania:petalblock:13>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_14",[<botania:petal:14>*9],[<botania:petalblock:14>],"10", "60", "20");
mods.rustichromia.HayCompactor.add("petalblock_15",[<botania:petal:15>*9],[<botania:petalblock:15>],"10", "60", "20");