package com.example.tddcicd

import java.util.Calendar


/**
 * Model class containing personal information that will be saved to SharedPreferences.
 */
class SharedPreferenceEntry(// Name of the user.
     name: String, // Date of Birth of the user.
     dateOfBirth: Calendar,
     email: String
) {

    // Email address of the user.
    val name: String
    val email: String
    val dateOfBirth: Calendar

    init {
        this.dateOfBirth = dateOfBirth
        this.email = email
        this.name = name
    }
}