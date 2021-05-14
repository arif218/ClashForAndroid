@file:Suppress("DEPRECATION")

package com.github.kr328.clash.common.compat

import android.content.res.Configuration
import android.os.Build
import java.util.*

val Configuration.preferredLocale: Locale
    get() {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            locales[0]
        } else {
            locale
        }
    }