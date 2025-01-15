package com.gch.automaton.event;

import com.gch.automaton.cache.LocalItem;

import java.util.UUID;

public class PassEnergyEvent {
    private UUID itemUUID;
    private Long unitId;

    public PassEnergyEvent(UUID itemUUID, Long unitId) {
        this.itemUUID = itemUUID;
        this.unitId = unitId;
    }

    public UUID getItemUUID() {
        return itemUUID;
    }

    public Long getUnitId() {
        return unitId;
    }
}
