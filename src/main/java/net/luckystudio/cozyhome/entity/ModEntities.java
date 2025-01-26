package net.luckystudio.cozyhome.entity;

import net.luckystudio.cozyhome.CozyHome;
import net.luckystudio.cozyhome.entity.custom.SeatEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<SeatEntity> SEAT_ENTITY = register(
            "seat",
            EntityType.Builder
                    .create(SeatEntity::new, SpawnGroup.MISC)
                    .dimensions(1f, 1f)
    );

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> typeBuilder) {
        RegistryKey<EntityType<?>> key = RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(CozyHome.MOD_ID, name));
        return Registry.register(Registries.ENTITY_TYPE, key, typeBuilder.build(key));
    }
}
