package com.bottlecap.bottleflow.locationHelper

import android.location.Address
import android.location.Location

interface ILocationResultListener {
    fun onLocationReady(location: Location?, address: Address?)
}
