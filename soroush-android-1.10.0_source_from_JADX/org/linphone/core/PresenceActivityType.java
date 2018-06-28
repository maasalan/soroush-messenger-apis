package org.linphone.core;

public enum PresenceActivityType {
    Offline(0),
    Online(1),
    Appointment(2),
    Away(3),
    Breakfast(4),
    Busy(5),
    Dinner(6),
    Holiday(7),
    InTransit(8),
    LookingForWork(9),
    Lunch(10),
    Meal(11),
    Meeting(12),
    OnThePhone(13),
    Other(14),
    Performance(15),
    PermanentAbsence(16),
    Playing(17),
    Presentation(18),
    Shopping(19),
    Sleeping(20),
    Spectator(21),
    Steering(22),
    Travel(23),
    TV(24),
    Unknown(25),
    Vacation(26),
    Working(27),
    Worship(28),
    Invalid(29);
    
    protected final int mValue;

    private PresenceActivityType(int i) {
        this.mValue = i;
    }

    protected static PresenceActivityType fromInt(int i) {
        switch (i) {
            case 0:
                return Offline;
            case 1:
                return Online;
            case 2:
                return Appointment;
            case 3:
                return Away;
            case 4:
                return Breakfast;
            case 5:
                return Busy;
            case 6:
                return Dinner;
            case 7:
                return Holiday;
            case 8:
                return InTransit;
            case 9:
                return LookingForWork;
            case 10:
                return Lunch;
            case 11:
                return Meal;
            case 12:
                return Meeting;
            case 13:
                return OnThePhone;
            case 14:
                return Other;
            case 15:
                return Performance;
            case 16:
                return PermanentAbsence;
            case 17:
                return Playing;
            case 18:
                return Presentation;
            case 19:
                return Shopping;
            case 20:
                return Sleeping;
            case 21:
                return Spectator;
            case 22:
                return Steering;
            case 23:
                return Travel;
            case 24:
                return TV;
            case 25:
                return Unknown;
            case 26:
                return Vacation;
            case 27:
                return Working;
            case 28:
                return Worship;
            default:
                return Invalid;
        }
    }

    public final int toInt() {
        return this.mValue;
    }
}
