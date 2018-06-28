package mobi.mmdt.ott.view.conversation.p427c;

import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

final class C3444a {
    protected static int m7878a(int i, int i2, int i3, String str) {
        Object obj = null;
        Object obj2 = i3 == C2973m.SINGLE.ordinal() ? 1 : null;
        Object obj3 = i3 == C2973m.BOT.ordinal() ? 1 : null;
        Object obj4 = i3 == C2973m.GROUP.ordinal() ? 1 : null;
        Object obj5 = i3 == C2973m.CHANNEL.ordinal() ? 1 : null;
        Object obj6 = i3 == C2973m.CHANNEL_REPLY.ordinal() ? 1 : null;
        if (i3 == C2973m.CHANNEL_DIRECT.ordinal()) {
            obj = 1;
        }
        if (i == C2972l.TEXT.ordinal()) {
            if (i2 == C2970j.IN.ordinal()) {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 13;
                        }
                        if (obj5 != null) {
                            return 14;
                        }
                        if (obj6 != null) {
                            return 18;
                        }
                        if (obj != null) {
                            return 16;
                        }
                    }
                }
                return 12;
            }
            if (obj2 == null) {
                if (obj3 == null) {
                    if (obj4 != null) {
                        return 1115;
                    }
                    if (obj5 != null) {
                        return 15;
                    }
                    if (obj6 != null) {
                        return 19;
                    }
                    if (obj != null) {
                        return 17;
                    }
                }
            }
            return 1111;
        } else if (i == C2972l.IMAGE.ordinal()) {
            if (i2 == C2970j.IN.ordinal()) {
                if (str == null || str.isEmpty()) {
                    if (obj2 == null) {
                        if (obj3 == null) {
                            if (obj4 != null) {
                                return 23;
                            }
                            if (obj5 != null) {
                                return 24;
                            }
                            if (obj6 != null) {
                                return 28;
                            }
                            if (obj != null) {
                                return 26;
                            }
                        }
                    }
                    return 22;
                }
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 73;
                        }
                        if (obj5 != null) {
                            return 74;
                        }
                        if (obj6 != null) {
                            return 78;
                        }
                        if (obj != null) {
                            return 76;
                        }
                    }
                }
                return 72;
            } else if (str == null || str.isEmpty()) {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 2115;
                        }
                        if (obj5 != null) {
                            return 25;
                        }
                        if (obj6 != null) {
                            return 29;
                        }
                        if (obj != null) {
                            return 27;
                        }
                    }
                }
                return 2111;
            } else {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 7115;
                        }
                        if (obj5 != null) {
                            return 75;
                        }
                        if (obj6 != null) {
                            return 79;
                        }
                        if (obj != null) {
                            return 77;
                        }
                    }
                }
                return 7111;
            }
        } else if (i == C2972l.LOCATION.ordinal()) {
            if (i2 == C2970j.IN.ordinal()) {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 123;
                        }
                        if (obj5 != null) {
                            return 124;
                        }
                        if (obj6 != null) {
                            return 128;
                        }
                        if (obj != null) {
                            return 126;
                        }
                    }
                }
                return IjkMediaMeta.FF_PROFILE_H264_HIGH_422;
            }
            if (obj2 == null) {
                if (obj3 == null) {
                    if (obj4 != null) {
                        return 12115;
                    }
                    if (obj5 != null) {
                        return 125;
                    }
                    if (obj6 != null) {
                        return 129;
                    }
                    if (obj != null) {
                        return 127;
                    }
                }
            }
            return 12111;
        } else if (i == C2972l.GIF.ordinal()) {
            if (i2 == C2970j.IN.ordinal()) {
                if (str == null || str.isEmpty()) {
                    if (obj2 == null) {
                        if (obj3 == null) {
                            if (obj4 != null) {
                                return 103;
                            }
                            if (obj5 != null) {
                                return 104;
                            }
                            if (obj6 != null) {
                                return 108;
                            }
                            if (obj != null) {
                                return 106;
                            }
                        }
                    }
                    return 102;
                }
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 113;
                        }
                        if (obj5 != null) {
                            return 114;
                        }
                        if (obj6 != null) {
                            return 118;
                        }
                        if (obj != null) {
                            return 116;
                        }
                    }
                }
                return 112;
            } else if (str == null || str.isEmpty()) {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 10115;
                        }
                        if (obj5 != null) {
                            return 105;
                        }
                        if (obj6 != null) {
                            return 109;
                        }
                        if (obj != null) {
                            return 107;
                        }
                    }
                }
                return 10111;
            } else {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 111115;
                        }
                        if (obj5 != null) {
                            return 115;
                        }
                        if (obj6 != null) {
                            return 119;
                        }
                        if (obj != null) {
                            return 117;
                        }
                    }
                }
                return 11111;
            }
        } else if (i == C2972l.VIDEO.ordinal()) {
            if (i2 == C2970j.IN.ordinal()) {
                if (str == null || str.isEmpty()) {
                    if (obj2 == null) {
                        if (obj3 == null) {
                            if (obj4 != null) {
                                return 33;
                            }
                            if (obj5 != null) {
                                return 34;
                            }
                            if (obj6 != null) {
                                return 38;
                            }
                            if (obj != null) {
                                return 36;
                            }
                        }
                    }
                    return 32;
                }
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 83;
                        }
                        if (obj5 != null) {
                            return 84;
                        }
                        if (obj6 != null) {
                            return 88;
                        }
                        if (obj != null) {
                            return 86;
                        }
                    }
                }
                return 82;
            } else if (str == null || str.isEmpty()) {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 3115;
                        }
                        if (obj5 != null) {
                            return 35;
                        }
                        if (obj6 != null) {
                            return 39;
                        }
                        if (obj != null) {
                            return 37;
                        }
                    }
                }
                return 3111;
            } else {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 8115;
                        }
                        if (obj5 != null) {
                            return 85;
                        }
                        if (obj6 != null) {
                            return 89;
                        }
                        if (obj != null) {
                            return 87;
                        }
                    }
                }
                return 8111;
            }
        } else if (i == C2972l.PUSH_TO_TALK.ordinal()) {
            if (i2 == C2970j.IN.ordinal()) {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 53;
                        }
                        if (obj5 != null) {
                            return 54;
                        }
                        if (obj6 != null) {
                            return 58;
                        }
                        if (obj != null) {
                            return 56;
                        }
                    }
                }
                return 52;
            }
            if (obj2 == null) {
                if (obj3 == null) {
                    if (obj4 != null) {
                        return 5115;
                    }
                    if (obj5 != null) {
                        return 55;
                    }
                    if (obj6 != null) {
                        return 59;
                    }
                    if (obj != null) {
                        return 57;
                    }
                }
            }
            return 5111;
        } else if (i == C2972l.FILE.ordinal()) {
            if (i2 == C2970j.IN.ordinal()) {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 43;
                        }
                        if (obj5 != null) {
                            return 44;
                        }
                        if (obj6 != null) {
                            return 48;
                        }
                        if (obj != null) {
                            return 46;
                        }
                    }
                }
                return 42;
            }
            if (obj2 == null) {
                if (obj3 == null) {
                    if (obj4 != null) {
                        return 4115;
                    }
                    if (obj5 != null) {
                        return 45;
                    }
                    if (obj6 != null) {
                        return 49;
                    }
                    if (obj != null) {
                        return 47;
                    }
                }
            }
            return 4111;
        } else if (i == C2972l.STICKER.ordinal()) {
            if (i2 == C2970j.IN.ordinal()) {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 63;
                        }
                        if (obj5 != null) {
                            return 64;
                        }
                        if (obj6 != null) {
                            return 68;
                        }
                        if (obj != null) {
                            return 66;
                        }
                    }
                }
                return 62;
            }
            if (obj2 == null) {
                if (obj3 == null) {
                    if (obj4 != null) {
                        return 6115;
                    }
                    if (obj5 != null) {
                        return 65;
                    }
                    if (obj6 != null) {
                        return 69;
                    }
                    if (obj != null) {
                        return 67;
                    }
                }
            }
            return 6111;
        } else if (i == C2972l.REPORT.ordinal()) {
            return 8;
        } else {
            if (i == C2972l.HEAD_MESSAGE.ordinal()) {
                return 7;
            }
            if (i == C2972l.VOTE.ordinal()) {
                if (i2 == C2970j.IN.ordinal()) {
                    if (obj2 == null) {
                        if (obj3 == null) {
                            return obj4 != null ? 133 : obj6 != null ? 94 : 92;
                        }
                    }
                    return 132;
                }
                if (obj2 == null) {
                    if (obj3 == null) {
                        return obj4 != null ? 137 : obj6 != null ? 95 : 93;
                    }
                }
                return 135;
            } else if (i != C2972l.AUDIO.ordinal()) {
                if (i != C2972l.MISSED_CALL.ordinal()) {
                    if (i == C2972l.CALL.ordinal()) {
                    }
                }
                return 6;
            } else if (i2 == C2970j.IN.ordinal()) {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 143;
                        }
                        if (obj5 != null) {
                            return IjkMediaMeta.FF_PROFILE_H264_HIGH_444;
                        }
                        if (obj6 != null) {
                            return 148;
                        }
                        if (obj != null) {
                            return 146;
                        }
                    }
                }
                return 142;
            } else {
                if (obj2 == null) {
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return 14115;
                        }
                        if (obj5 != null) {
                            return 145;
                        }
                        if (obj6 != null) {
                            return 149;
                        }
                        if (obj != null) {
                            return 147;
                        }
                    }
                }
                return 14111;
            }
        }
        return 9992;
    }

    static String m7879a(String str, String str2, String str3) {
        String[] split = str.split(",");
        if (split.length != 2) {
            return str2;
        }
        StringBuilder stringBuilder;
        if (str3.equals("en-us")) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(" , ");
            str = split[1];
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(" ، ");
            str = C2491i.m6814b(split[1]);
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
