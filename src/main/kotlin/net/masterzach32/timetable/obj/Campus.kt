package net.masterzach32.timetable.obj

/**
 * @author Zach Kozar
 * @version 8/7/2018
 */
enum class Campus(val id: Int, val prettyName: String) {
    BLACKSBURG(0, "Blacksburg"),
    VIRTUAL(10, "Virtual"),
    WESTERN(2, "Western"),
    VALLEY(3, "Valley"),
    NATIONAL_CAPITAL_REGION(4, "National Capital Region"),
    CENTRAL(6, "Central"),
    HAMPTON_ROADS_CENTER(7, "Hampton Roads Center"),
    CAPITAL(8, "Capital"),
    OTHER(9, "Other");

    override fun toString() = prettyName
}