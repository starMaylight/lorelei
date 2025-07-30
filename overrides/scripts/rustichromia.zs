import mods.rustichromia.Assembler;
recipes.removeByRecipeName("rustichromia:assembler2");
mods.rustichromia.Assembler.add('golden_fiber', 1,[<solar:infused_gold>,<embers:dust_ember>], [<naturesaura:gold_fiber>], 1.0, 256.0, 15.0);
mods.rustichromia.Assembler.add('cooking_pot', 1,[<minefantasyreforged:plate>.withTag({mf_custom_materials: {main_material: "iron"}})*7,<minecraft:water_bucket>], [<betterwithmods:cooking_pot:1>], 1.0, 256.0, 15.0);
mods.rustichromia.Assembler.add('standnature', 2,[<ore:logWood>,<solar:infused_gold>], [<naturesaura:wood_stand>], 20.0, 256.0, 15.0);
mods.rustichromia.Assembler.add('gatekey', 2,[<correlated:misc:6>,<minefantasyreforged:dragon_heart>,<abyssalcraft:oc>,<dust:crystal:5>*2], [<abyssalcraft:gatewaykey>.withTag({})], 20.0, 256.0, 15.0);
mods.rustichromia.Assembler.add('circuit1', 2,[<ore:plateIron>,<naturesaura:gold_powder>*4,<correlated:misc:5>,<ore:dustRedstone>*16], [<correlated:misc:20>], 100.0, 256.0, 15.0);