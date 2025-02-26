/*
 * SkinsRestorer
 *
 * Copyright (C) 2021 SkinsRestorer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 */
package net.skinsrestorer.api.property;

import lombok.Data;

import java.io.Serializable;

@Data
public class GenericProperty implements Serializable, IProperty {
    private static final long serialVersionUID = 8095720466547433965L;
    private String name;
    private String value;
    private String signature;

    public GenericProperty() {
    }

    @SuppressWarnings("unused")
    public GenericProperty(IProperty property) {
        name = property.getName();
        value = property.getValue();
        signature = property.getSignature();
    }

    public GenericProperty(String name, String value, String signature) {
        this.name = name;
        this.value = value;
        this.signature = signature;
    }

    @Override
    public Object getHandle() {
        return this;
    }
}
