/**
 * Designed and developed by Aidan Follestad (@afollestad)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.afollestad.mnmlscreenrecord.di

import com.afollestad.mnmlscreenrecord.common.Qualifiers.IO_DISPATCHER
import com.afollestad.mnmlscreenrecord.common.Qualifiers.MAIN_DISPATCHER
import com.afollestad.mnmlscreenrecord.common.prefs.PrefNames.PREF_ALWAYS_SHOW_CONTROLS
import com.afollestad.mnmlscreenrecord.ui.main.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

/** @author Aidan Follestad (@afollestad) */
val viewModelModule = module {

  viewModel {
    MainViewModel(
        get(name = MAIN_DISPATCHER),
        get(name = IO_DISPATCHER),
        get(),
        get(),
        get(),
        get(),
        get(),
        get(),
        get(),
        get(name = PREF_ALWAYS_SHOW_CONTROLS)
    )
  }
}
