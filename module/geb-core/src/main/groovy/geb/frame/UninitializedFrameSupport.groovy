/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package geb.frame

import geb.Initializable
import geb.Page
import geb.content.SimplePageContent
import geb.navigator.Navigator

class UninitializedFrameSupport implements FrameSupport {
	private final Initializable initializable

	UninitializedFrameSupport(Initializable initializable) {
		this.initializable = initializable
	}

	@Override
	def withFrame(Object frame, Class<? extends Page> pageClass = null, Closure block) {
		throw initializable.uninitializedException()
	}

	@Override
	def withFrame(Object frame, Page page, Closure block) {
		throw initializable.uninitializedException()
	}

	@Override
	def withFrame(Navigator frame, Class<? extends Page> pageClass = null, Closure block) {
		throw initializable.uninitializedException()
	}

	@Override
	def withFrame(Navigator frame, Page pageClass, Closure block) {
		throw initializable.uninitializedException()
	}

	@Override
	def withFrame(SimplePageContent frame, Closure block) {
		throw initializable.uninitializedException()
	}
}
