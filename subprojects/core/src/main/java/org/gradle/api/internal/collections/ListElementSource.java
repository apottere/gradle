/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.internal.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListElementSource<T> implements IndexedElementSource<T> {
    private final List<T> values = new ArrayList<T>();
    @Override
    public boolean isEmpty() {
        return values.isEmpty();
    }

    @Override
    public boolean constantTimeIsEmpty() {
        return values.isEmpty();
    }

    @Override
    public int size() {
        return values.size();
    }

    @Override
    public int estimatedSize() {
        return values.size();
    }

    @Override
    public Iterator<T> iterator() {
        return values.iterator();
    }

    @Override
    public ListIterator<T> listIterator() {
        return values.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return values.listIterator(index);
    }

    @Override
    public boolean contains(Object element) {
        return values.contains(element);
    }

    @Override
    public boolean containsAll(Collection<?> elements) {
        return values.containsAll(elements);
    }

    @Override
    public List<? extends T> subList(int fromIndex, int toIndex) {
        return values.subList(fromIndex, toIndex);
    }

    @Override
    public T get(int index) {
        return values.get(index);
    }

    @Override
    public int indexOf(Object o) {
        return values.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return values.lastIndexOf(o);
    }

    @Override
    public boolean add(T element) {
        return values.add(element);
    }

    @Override
    public void add(int index, T element) {
        values.add(index, element);
    }

    @Override
    public T set(int index, T element) {
        return values.set(index, element);
    }

    @Override
    public boolean remove(Object o) {
        return values.remove(o);
    }

    @Override
    public T remove(int index) {
        return values.remove(index);
    }

    @Override
    public void clear() {
        values.clear();
    }
}
