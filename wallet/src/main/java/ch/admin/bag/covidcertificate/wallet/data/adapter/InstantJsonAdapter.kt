/*
 * Copyright (c) 2021 Ubique Innovation AG <https://www.ubique.ch>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package ch.admin.bag.covidcertificate.wallet.data.adapter

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.time.Instant

class InstantJsonAdapter {

	@FromJson
	fun fromJson(json: String) = json.toLongOrNull()?.let { Instant.ofEpochMilli(it) }

	@ToJson
	fun toJson(value: Instant?) = value?.toEpochMilli()?.toString()
}