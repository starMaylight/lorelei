val itemstoRemoves =
[
    "embers:mixer"
] as string[];

for item in itemstoRemoves {
	recipes.removeByRecipeName(item);
}