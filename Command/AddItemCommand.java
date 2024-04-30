package com.example.sharingapp;

import android.content.Context;


/**
 * Command to add item
 */
public class AddItemCommand extends Command {

    private final ItemList item_list;
    private final Item item;
    private final Context context;

    public AddItemCommand(ItemList item_list, Item item, Context context) {
        this.item_list = item_list;
        this.item = item;
        this.context = context;
    }

    public void execute() {
        item_list.addItem(item);
        setIsExecuted(item_list.saveItems(context));
    }
}