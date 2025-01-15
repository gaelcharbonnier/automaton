package com.gch.automaton.cache;

import java.util.UUID;

public interface LocalItem {
    UUID getUUID();
    ItemType getItemType();
    UnitZoneType getUnitZoneType();
}
