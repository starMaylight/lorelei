val itemstoRemoves =
[
    "betterwithmods:blocks/mech/cauldron"
] as string[];

for item in itemstoRemoves {
	recipes.removeByRecipeName(item);
}