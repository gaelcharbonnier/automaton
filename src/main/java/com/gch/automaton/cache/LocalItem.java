package com.gch.automaton.cache;

import java.util.UUID;

public class LocalItem {
    private UUID uuid;
    private ItemType itemType;
    private UnitZoneType unitZoneType;
    private Object value;

    public LocalItem(UUID uuid, ItemType itemType, UnitZoneType unitZoneType, Object value) {
        this.uuid = uuid;
        this.itemType = itemType;
        this.unitZoneType = unitZoneType;
        this.value = value;
    }


    public UUID getUuid() {
        return uuid;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public UnitZoneType getUnitZoneType() {
        return unitZoneType;
    }

    public Object getValue() {
        return value;
    }
}
