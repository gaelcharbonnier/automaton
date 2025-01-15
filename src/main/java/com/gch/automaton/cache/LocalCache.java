package com.gch.automaton.cache;

import java.util.List;

public interface LocalCache {

    Unit getUnitById(Long id);

    List<LocalItem> getUnitItems(long unitId, UnitZoneType zoneType, ItemType... types);
}
