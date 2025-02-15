/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.world.biome;

import com.sk89q.worldedit.function.pattern.BiomePattern;
import com.sk89q.worldedit.math.BlockVector3;
import com.sk89q.worldedit.registry.Keyed;
import com.sk89q.worldedit.registry.NamespacedRegistry;

/**
 * All the types of biomes in the game.
 */
public class BiomeType implements Keyed, BiomePattern {

    public static final NamespacedRegistry<BiomeType> REGISTRY = new NamespacedRegistry<>("biome type");

    private String id;

    public BiomeType(String id) {
        this.id = id;
    }

    /**
     * Gets the ID of this biome.
     *
     * @return The id
     */
    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return getId();
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof BiomeType && this.id.equals(((BiomeType) obj).id);
    }

    @Override
    public BiomeType applyBiome(BlockVector3 position) {
        return this;
    }
}
