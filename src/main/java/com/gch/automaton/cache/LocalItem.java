package com.gch.automaton.cache;

import java.time.Instant;
import java.util.UUID;

public class LocalItem {
    private UUID uuid;
    private Long unitId;
    private ItemType itemType;
    private UnitZoneType unitZoneType;
    private Instant valueDate;
    private Object value;

    public LocalItem(UUID uuid, Long unitId, ItemType itemType, UnitZoneType unitZoneType, Instant valueDate, Object value) {
        this.uuid = uuid;
        this.unitId = unitId;
        this.itemType = itemType;
        this.unitZoneType = unitZoneType;
        this.valueDate = valueDate;
        this.value = value;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public UnitZoneType getUnitZoneType() {
        return unitZoneType;
    }

    public void setUnitZoneType(UnitZoneType unitZoneType) {
        this.unitZoneType = unitZoneType;
    }

    public Instant getValueDate() {
        return valueDate;
    }

    public void setValueDate(Instant valueDate) {
        this.valueDate = valueDate;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
