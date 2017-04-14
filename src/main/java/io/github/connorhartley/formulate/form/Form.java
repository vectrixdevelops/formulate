/*
 * MIT License
 *
 * Copyright (c) 2017 Connor (Vectrix)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.github.connorhartley.formulate.form;

import io.github.connorhartley.formulate.element.FormElement;
import io.github.connorhartley.formulate.element.item.ElementItem;
import org.spongepowered.api.text.Text;

public class Form<T> {

    public Form(Builder<T> builder) {}

    public Builder builder() {
        return new Builder<T>();
    }

    public static class Builder<T> {

        public Builder() {}

        public Builder id(String id) {
            return this;
        }

        public Builder padding(Text padding) {
            return this;
        }

        public Builder template(Class<T> template) {
            return this;
        }

        public Builder element(FormElement<T, ElementItem<T>> element) {
            return this;
        }

        public Form<T> build() {
            return new Form<>(this);
        }

    }

}