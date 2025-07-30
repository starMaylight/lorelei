import mods.naturesaura.altar
import mods.embers.heat_coil
import mods.abyssaltweaker.ritual

def remove = [
    item('thaumicwands:item_wand_cap'),
    item('clockworkphase:framework'),
    item('clockworkphase:winding_box'),
    item('clockworkphase:clockwork_assembly_table'),
    item('wizardry:orb'),
    item('randomthings:itemcollector'),
    item('dust:crusheritems'),
    item('dust:path2'),
    item('harkenscythe:soul_soot'),
    item('arcanearchives:radiant_resonator'),
    item('arcanearchives:gemcutters_table'),
    item('harkenscythe:soul_crucible'),
    item('harkenscythe:soul_altar'),
    item('harkenscythe:soul_absorber'),
    item('actuallyadditions:block_misc', 9),
    item('abyssalcraft:coraliumstone'),
    item('abyssalcraft:oblivionshard'),
    item('randomthings:ingredient', 3),
    item('correlated:misc', 5),
    item('correlated:misc', 3),
    item('abyssalcraft:gatewaykey'),
    item('correlated:misc', 1),
    item('correlated:misc', 2),
    item('correlated:misc', 20),
    item('correlated:misc', 21),
    item('correlated:terminal'),
    item('correlated:interface'),
    item('abyssalcraft:cchunk')
    ]
for(part in remove) {
    crafting.removeByOutput(part)
}
furnace.removeByOutput(item('harkenscythe:soumberglass_ingot'))
mods.abyssaltweaker.ritual.removeByOutput(item('abyssalcraft:transmutationgem'))

crafting.addShaped("item_wand_cap",item('thaumicwands:item_wand_cap'),
[[item('naturesaura:infused_iron'),item('naturesaura:infused_iron'),item('naturesaura:infused_iron')],[item('naturesaura:infused_iron'),null,item('naturesaura:infused_iron')],[null,null,null]]
)
crafting.addShapeless("mainspring",item('clockworkphase:mainspring').withNbt(['tension_energy': 2000, 'max_tension': 0]),[ore('stickIron'),ore('stickIron'),ore('stickIron'),ore('stickIron'),ore('stickIron'),ore('stickIron'),ore('stickIron'),ore('stickIron'),ore('stickIron')])
crafting.addShaped("framework",item('clockworkphase:framework'),
[[ore('ingotBrass'),item('naturesaura:infused_iron'),ore('ingotBrass')],[item('naturesaura:infused_iron'),ore('gearBrass'),item('naturesaura:infused_iron')],[ore('ingotBrass'),item('naturesaura:infused_iron'),ore('ingotBrass')]]
)
crafting.addShaped("windingbox",item('clockworkphase:winding_box'),
[[ore('ingotBrass'),item('naturesaura:infused_iron'),ore('ingotBrass')],[item('naturesaura:infused_iron'),item('clockworkphase:clockwork_assembly_table'),item('naturesaura:infused_iron')],[ore('ingotBrass'),item('naturesaura:infused_iron'),ore('ingotBrass')]]
)
crafting.addShaped("clockwork_assembly_table",item('clockworkphase:clockwork_assembly_table'),
[[ore('ingotBrass'),item('solar:infused_gold'),ore('ingotBrass')],[item('solar:infused_gold'),item('clockworkphase:framework'),item('solar:infused_gold')],[ore('ingotBrass'),item('solar:infused_gold'),ore('ingotBrass')]]
)
crafting.addShaped("wizardry_orb",item('wizardry:orb'),
[[null,item('betterwithaddons:decomat', 3),null],[item('betterwithaddons:decomat', 3),item('clockworkphase:nugget_temporal'),item('betterwithaddons:decomat', 3)],[null,item('betterwithaddons:decomat', 3),null]]
)
crafting.addShaped("crystalbase",item('dust:crystalcluster'),
[[ore('dstone'),item('wizardry:levitation_orb'),ore('dstone')]]
)

mods.naturesaura.altar.recipeBuilder()
    .name('manafluid')
    .input(item('clockworkphase:time_sand_bucket'))
    .catalyst(item('clockworkphase:brass_block'))
    .output(item('forge:bucketfilled').withNbt(['FluidName': 'mana_fluid', 'Amount': 1000]))
    .aura(1000)
    .time(50)
    .register()

crafting.addShaped("dust_machine_base",item('dust:machinebase'),
[[ore('gemCrystal'),ore('gemCrystal'),ore('gemCrystal')],[ore('gemCrystal'),item('dust:crystalcluster'),ore('gemCrystal')],[ore('gemCrystal'),item('betterwithaddons:japanmat', 24),ore('gemCrystal')]]
)
crafting.addShaped("dust_crush_comp",item('dust:crusheritems'),
[[item('betterwithaddons:japanmat', 30),ore('gemCrystal'),item('betterwithaddons:japanmat', 30)],[ore('gemCrystal'),item('dust:machinebase'),ore('gemCrystal')],[item('betterwithaddons:japanmat', 30),ore('gemCrystal'),item('betterwithaddons:japanmat', 30)]]
)
crafting.addShaped("dust_path2",item('dust:path2')*4,
[[item('dust:dust', 9),item('dust:path1'),item('dust:dust', 9)],[item('dust:path1'),item('dust:dust/blazedust'),item('dust:path1')],[item('dust:dust', 9),item('dust:path1'),item('dust:dust', 9)]]
)
mods.naturesaura.altar.recipeBuilder()
    .name('manadust_crush')
    .input(item('wizardry:fairy_wings'))
    .catalyst(item('dust:path4'))
    .output(item('wizardry:fairy_dust'))
    .aura(100)
    .time(50)
    .register()
mods.naturesaura.altar.recipeBuilder()
    .name('dpedestal_to_resonator')
    .input(ore('dPedestal'))
    .catalyst(item('dust:path4'))
    .output(item('arcanearchives:radiant_resonator'))
    .aura(5000)
    .time(50)
    .register()

crafting.addShaped("gemcutting_table",item('arcanearchives:gemcutters_table'),
[[item('dust:crusheritems'),item('naturesaura:range_visualizer'),item('betterwithaddons:japanmat', 11)],[item('minefantasyreforged:bone_needle'),ore('workbench'),item('naturesaura:ancient_slab')],[item('arcanearchives:storage_raw_quartz'),item('solar:sunburnt_chest'),item('arcanearchives:storage_raw_quartz')]]
)
mods.embers.heat_coil.recipeBuilder()
    .input(item('harkenscythe:soul_soot'))
    .output(item('harkenscythe:soumberglass_ingot'))
    .register()

mods.betterwithaddons.infuser.shapedBuilder()
    .output(item('harkenscythe:soul_crucible'))
    .matrix([[item('minefantasyreforged:obsidian_ingot'), null, item('minefantasyreforged:obsidian_ingot')],
            [item('minefantasyreforged:obsidian_ingot'), item('harkenscythe:soumberglass_ingot'), item('minefantasyreforged:obsidian_ingot')],
            [item('minefantasyreforged:plate_huge').withNbt(['mf_custom_materials': ['main_material': 'black_steel']]),item('minefantasyreforged:obsidian_ingot'),item('minefantasyreforged:plate_huge').withNbt(['mf_custom_materials': ['main_material': 'black_steel']])]])
    .spirits(8)
    .register()
mods.betterwithaddons.infuser.shapedBuilder()
    .output(item('harkenscythe:soul_absorber'))
    .matrix([[null, item('naturesaura:grated_chute'), null],
            [item('harkenscythe:soumberglass_ingot'), item('minefantasyreforged:obsidian_ingot'), item('harkenscythe:soumberglass_ingot')],
            [item('minefantasyreforged:plate_huge').withNbt(['mf_custom_materials': ['main_material': 'black_steel']]),item('minefantasyreforged:obsidian_ingot'),item('minefantasyreforged:plate_huge').withNbt(['mf_custom_materials': ['main_material': 'black_steel']])]])
    .spirits(8)
    .register()
mods.betterwithaddons.infuser.shapedBuilder()
    .output(item('harkenscythe:soul_altar'))
    .matrix([[null, item('harkenscythe:shadow_book'), null],
            [item('harkenscythe:soumberglass_ingot'), item('minefantasyreforged:obsidian_ingot'), item('harkenscythe:soumberglass_ingot')],
            [item('minefantasyreforged:plate_huge').withNbt(['mf_custom_materials': ['main_material': 'black_steel']]),item('minefantasyreforged:obsidian_ingot'),item('minefantasyreforged:plate_huge').withNbt(['mf_custom_materials': ['main_material': 'black_steel']])]])
    .spirits(10)
    .register()
crafting.addShaped("iron_casing",item('actuallyadditions:block_misc', 9),
[[ore('plateIron'),item('wizardry:wisdom_stick'),ore('plateIron')]
,[item('wizardry:wisdom_stick'),ore('blockLivingmetal'),item('wizardry:wisdom_stick')],
[ore('plateIron'),item('wizardry:wisdom_stick'),ore('plateIron')]])
crafting.addShaped("necron",item('abyssalcraft:necronomicon').withNbt(['PotEnergy': 0.0f]),
[[ore('ingotDawnstone'),ore('ingotDawnstone'),item('wizardry:devil_dust')]
,[ore('ingotDawnstone'),item('minecraft:book'),ore('ingotDawnstone')],
[ore('ingotDawnstone'),ore('ingotDawnstone'),item('wizardry:devil_dust')]])

mods.naturesaura.altar.recipeBuilder()
    .name('coralium_ore')
    .input(item('abyssalcraft:ccluster9'))
    .catalyst(item('clockworkphase:brass_block'))
    .output(item('abyssalcraft:coraliumstone'))
    .aura(100)
    .time(50)
    .register()

mods.abyssaltweaker.ritual.recipeBuilder()
    .name('transmutationgem')
    .centerItem(item('abyssalcraft:cpearl'))
    .input(item('sweetmagic:pure_crystal'),item('harkenscythe:basic_essence_keeper_soul'),item('sweetmagic:pure_crystal'),item('harkenscythe:basic_essence_keeper_soul'),item('sweetmagic:pure_crystal'),item('clockworkphase:ingot_temporal'),item('sweetmagic:pure_crystal'),item('clockworkphase:ingot_temporal'))
    .output(item('abyssalcraft:transmutationgem'))
    .pe(300)
    .register()

crafting.addShaped("oblivionshard",item('abyssalcraft:oblivionshard')*4,
[[item('arcanearchives:shaped_quartz'),item('abyssalcraft:shadowgem'),item('arcanearchives:shaped_quartz')]
,[item('abyssalcraft:shadowgem'),item('abyssalcraft:transmutationgem'),item('abyssalcraft:shadowgem')],
[item('arcanearchives:shaped_quartz'),item('abyssalcraft:shadowgem'),item('arcanearchives:shaped_quartz')]])

mods.harkenscythe.soul_altar.recipeBuilder()
    .input(item('randomthings:ingredient', 3))
    .output(item('correlated:misc', 11))
    .requiredSouls(10)
    .register()

crafting.addShaped("luminouspearl",item('correlated:misc', 3),
[[null,item('correlated:misc', 5),null]
,[item('correlated:misc', 5),ore('enderpearl'),item('correlated:misc', 5)],
[null,item('correlated:misc', 5),null]])

def crs = [
    [input: item('correlated:misc', 11), output: item('correlated:misc', 5)]
]

for (r in crs) {
    mods.actuallyadditions.crusher.recipeBuilder()
        .input(r.input).output(r.output).register()
    mods.betterwithmods.mill_stone.recipeBuilder()
        .input(r.input).output(r.output).register()
    mods.enderio.sag_mill.recipeBuilder()
        .input(r.input).output(r.output).energy(1000).bonusTypeMultiply().register()
    mods.extrautils2.crusher.recipeBuilder()
        .input(r.input).output(r.output).energy(1000).time(5).register()
    mods.immersiveengineering.crusher.recipeBuilder()
        .input(r.input).output(r.output).energy(100).register()
    mods.integrateddynamics.squeezer.recipeBuilder()
        .input(r.input).output(r.output).register()
    mods.integrateddynamics.mechanical_squeezer.recipeBuilder()
        .input(r.input).output(r.output).register()
    mods.mekanism.crusher.recipeBuilder()
        .input(r.input).output(r.output).register()
    mods.thermalexpansion.pulverizer.recipeBuilder()
        .input(r.input).output(r.output).energy(1000).register()
}

mods.arcanearchives.gem_cutting_table.recipeBuilder()
    .input(item('immersiveintelligence:material', 47),item('correlated:misc', 5),item('minecraft:redstone')*16,item('minefantasyreforged:fireclay')*4)
    .output(item('correlated:misc', 1) * 4)
    .register()
crafting.addShaped("co_highdensitydisc",item('correlated:misc', 2),
[[item('actuallyadditions:item_crystal', 5),item('correlated:misc', 1),item('actuallyadditions:item_crystal', 5)]
,[item('correlated:misc', 1),item('actuallyadditions:block_crystal', 5),item('correlated:misc', 1)],
[item('actuallyadditions:item_crystal', 5),item('correlated:misc', 1),item('actuallyadditions:item_crystal', 5)]])

crafting.addShaped("co_balancedcore",item('correlated:misc', 21),
[[item('minefantasyreforged:fireclay'),item('randomthings:stableenderpearl'),item('minefantasyreforged:fireclay')]
,[item('randomthings:stableenderpearl'),item('actuallyadditions:item_crystal', 2),item('randomthings:stableenderpearl')],
[item('minefantasyreforged:fireclay'),item('randomthings:stableenderpearl'),item('minefantasyreforged:fireclay')]])

crafting.addShaped("co_terminal",item('correlated:terminal'),
[[item('minefantasyreforged:bar').withNbt(['mf_custom_materials': ['main_material': 'steel']]),item('minefantasyreforged:bar').withNbt(['mf_custom_materials': ['main_material': 'steel']]),item('minefantasyreforged:bar').withNbt(['mf_custom_materials': ['main_material': 'steel']])]
,[item('correlated:misc', 3),item('correlated:misc', 3),item('correlated:misc', 3)],
[item('minefantasyreforged:bar').withNbt(['mf_custom_materials': ['main_material': 'steel']]),item('correlated:misc', 20),item('minefantasyreforged:bar').withNbt(['mf_custom_materials': ['main_material': 'steel']])]])

crafting.addShaped("co_interface",item('correlated:interface'),
[[item('minefantasyreforged:bar').withNbt(['mf_custom_materials': ['main_material': 'steel']]),item('solar:infused_gold'),item('minefantasyreforged:bar').withNbt(['mf_custom_materials': ['main_material': 'steel']])]
,[item('solar:infused_gold'),item('correlated:misc', 3),item('solar:infused_gold')],
[item('minefantasyreforged:bar').withNbt(['mf_custom_materials': ['main_material': 'steel']]),item('solar:infused_gold'),item('minefantasyreforged:bar').withNbt(['mf_custom_materials': ['main_material': 'steel']])]])
mods.abyssaltweaker.transmutation.recipeBuilder()
    .input(ore('oreLiquifiedCoralium'))
    .output(item('abyssalcraft:cingot'))
    .xp(0.5)
    .register()

crafting.addShaped("cchunk",item('abyssalcraft:cchunk'),
[[item('abyssalcraft:cpearl'),item('abyssalcraft:ccluster9'),item('abyssalcraft:cpearl')]
,[item('abyssalcraft:ccluster9'),item('abyssalcraft:cingot'),item('abyssalcraft:ccluster9')],
[item('abyssalcraft:cpearl'),item('abyssalcraft:ccluster9'),item('abyssalcraft:cpearl')]])