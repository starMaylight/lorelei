val itemstoRemoves =
[
    "naturesaura:gold_powder"
] as string[];

for item in itemstoRemoves {
	recipes.removeByRecipeName(item);
}