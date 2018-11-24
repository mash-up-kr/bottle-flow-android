package com.bottlecap.bottleflow.locationHelper

import android.location.Address

interface ILocationReadyListener {
    fun onLocationReady(addressList: List<Address>?)
}
