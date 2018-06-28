package mobi.mmdt.ott.logic.stheme;

import android.graphics.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.regex.Pattern;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.view.tools.p480d.C4503a;

public class UIThemeManager {
    public static final String KEY_THEME_EXTENSION = "stheme";
    public static final String KEY_THEME_EXTENSION_V2 = "stheme2";
    public static final int black = -16777216;
    public static final int color_accent_default_theme = -15046020;
    public static final int color_primary_dark_default_theme = -15573912;
    public static final int color_primary_default_theme = -14846061;
    public static final int color_text_primary_default_theme = -13082781;
    public static final int color_text_primary_new_design_theme = -1;
    public static final int color_text_primary_new_design_with_opacity_default_theme = -4079167;
    public static final int color_text_selection_theme = -4802890;
    public static final int color_toolbar_sub_title_default_theme = -7024426;
    public static final int color_toolbar_title_default_theme = -1;
    public static final int disable_color = -6776680;
    public static final int gray = -12040120;
    private static UIThemeManager mInstance = null;
    public static final int transparent_toolbar_color = -1426063360;
    public static final int white = -1;
    private int about_background_color;
    private int accent_color;
    private int background_floating_forward_button_color;
    private int block_background_color;
    private int block_text_color;
    private int bot_button_color;
    private int bot_button_text_color;
    private int button_text_color;
    private int date_bubble_background_color;
    private int date_bubble_text_color;
    private int explore_channel_followed_button_color;
    private int explore_channel_item_background_color;
    private int fab_ripple_color;
    private int feedback_dialog_background_color;
    private String font_name;
    private int frame_view_color;
    private int icon_not_selected_color;
    private int icon_toolbar_dark_color;
    private int icon_toolbar_white_color;
    private int input_background_sticker_like_and_time_color;
    private int input_bubble_background_color;
    private int input_button_color;
    private int input_button_text_color;
    private int input_content_and_caption_message_text_color;
    private int input_duration_and_size_media_color;
    private int input_fill_like_image_color;
    private int input_link_message_text_color;
    private int input_outline_like_image_color;
    private int input_time_and_like_message_color;
    private int line_divider_color;
    private int line_divider_in_main_activity_color;
    private int menu_item_white_color;
    private int mute_unread_count_color;
    private int output_background_sticker_like_and_time_color;
    private int output_bubble_background_color;
    private int output_button_color;
    private int output_button_text_color;
    private int output_content_and_caption_message_text_color;
    private int output_duration_and_size_media_color;
    private int output_link_message_text_color;
    private int output_time_and_like_message_color;
    private int pin_image_color;
    private int primary_color;
    private int primary_dark_color;
    private int progress_bar_color;
    private int recycler_view_background_color;
    private int seen_status_image_color;
    private int shadow_input_bubble_chat_color;
    private int shadow_output_bubble_chat_color;
    private int shadow_toolbar_end_gradient_color;
    private int shadow_toolbar_start_gradient_color;
    private int spacer_view_color;
    private int status_image_color;
    private int status_image_conversation_color;
    private int subtitle_toolbar_color;
    private int switch_line_color;
    private int tab_badge_text_color;
    private int tab_not_selected_gray_color;
    private int tab_selected_color;
    private int text_primary_color;
    private int text_primary_new_design_color;
    private int text_primary_new_design_with_opacity_color;
    private int text_secondary_color;
    private int title_profile_text_color;
    private int toolbar_line_separator_color;

    public UIThemeManager() {
        initDefaultColor();
        init();
    }

    private boolean checkColorValidity(String str) {
        return Pattern.compile("#([0-9a-fA-F]{3}|[0-9a-fA-F]{6}|[0-9a-fA-F]{8})").matcher(str).matches();
    }

    private String getTheme() {
        return C2535a.m6888a().ab();
    }

    public static UIThemeManager getmInstance() {
        if (mInstance == null) {
            mInstance = new UIThemeManager();
        }
        return mInstance;
    }

    private void init() {
        C2480b.m6736b(" stheme init");
        String theme = getTheme();
        if (!theme.equalsIgnoreCase("default")) {
            try {
                setTheme(theme, false);
            } catch (IOException e) {
                C2480b.m6736b(e.toString());
                saveTheme("default");
            }
        }
    }

    private void initDefaultColor() {
        this.primary_color = -1;
        this.primary_dark_color = -5623709;
        this.accent_color = -5623709;
        this.fab_ripple_color = -2136166;
        this.text_primary_new_design_with_opacity_color = UIThemeDefaultValue.default_text_primary_new_design_with_opacity_color;
        this.text_primary_new_design_color = UIThemeDefaultValue.default_text_primary_new_design_color;
        this.text_primary_color = UIThemeDefaultValue.default_text_primary_color;
        this.text_secondary_color = UIThemeDefaultValue.default_text_secondary_color;
        this.icon_not_selected_color = -12040120;
        this.line_divider_color = UIThemeDefaultValue.default_line_divider_color;
        this.line_divider_in_main_activity_color = -1;
        this.status_image_color = UIThemeDefaultValue.default_status_image_color;
        this.status_image_conversation_color = -1;
        this.seen_status_image_color = UIThemeDefaultValue.default_seen_status_image_color;
        this.recycler_view_background_color = -1;
        this.pin_image_color = -12040120;
        this.toolbar_line_separator_color = UIThemeDefaultValue.default_toolbar_line_separator_color;
        this.shadow_toolbar_start_gradient_color = 0;
        this.shadow_toolbar_end_gradient_color = UIThemeDefaultValue.default_shadow_toolbar_end_gradient_color;
        this.button_text_color = -1;
        this.explore_channel_item_background_color = -1;
        this.mute_unread_count_color = UIThemeDefaultValue.default_mute_unread_count_color;
        this.input_bubble_background_color = -1;
        this.output_bubble_background_color = UIThemeDefaultValue.default_output_bubble_background_color;
        this.subtitle_toolbar_color = UIThemeDefaultValue.default_subtitle_toolbar_color;
        this.input_duration_and_size_media_color = -1;
        this.input_time_and_like_message_color = -870441442;
        this.input_button_color = -5623709;
        this.input_button_text_color = -1;
        this.input_content_and_caption_message_text_color = -870441442;
        this.input_link_message_text_color = -5623709;
        this.input_fill_like_image_color = -5623965;
        this.input_outline_like_image_color = -12040120;
        this.output_duration_and_size_media_color = -1;
        this.output_time_and_like_message_color = -1;
        this.output_button_color = UIThemeDefaultValue.default_output_button_color;
        this.output_button_text_color = -16777216;
        this.output_content_and_caption_message_text_color = -1;
        this.output_link_message_text_color = UIThemeDefaultValue.default_output_link_message_text_color;
        this.date_bubble_background_color = UIThemeDefaultValue.default_date_bubble_background_color;
        this.date_bubble_text_color = UIThemeDefaultValue.default_date_bubble_text_color;
        this.menu_item_white_color = -1;
        this.title_profile_text_color = -1;
        this.block_text_color = -1;
        this.block_background_color = UIThemeDefaultValue.default_block_background_color;
        this.spacer_view_color = UIThemeDefaultValue.default_spacer_view_color;
        this.frame_view_color = UIThemeDefaultValue.default_frame_view_color;
        this.icon_toolbar_dark_color = -12040120;
        this.icon_toolbar_white_color = -1;
        this.switch_line_color = UIThemeDefaultValue.default_line_switch_color;
        this.tab_not_selected_gray_color = UIThemeDefaultValue.default_tab_not_selected_color;
        this.tab_selected_color = -1;
        this.tab_badge_text_color = UIThemeDefaultValue.default_tab_badge_text_color;
        this.feedback_dialog_background_color = UIThemeDefaultValue.default_feedback_dialog_background_color;
        this.progress_bar_color = UIThemeDefaultValue.default_progress_bar_color;
        this.shadow_input_bubble_chat_color = 218103808;
        this.shadow_output_bubble_chat_color = 218103808;
        this.bot_button_color = UIThemeDefaultValue.default_bot_button_color;
        this.bot_button_text_color = UIThemeDefaultValue.default_bot_button_text_color;
        this.background_floating_forward_button_color = UIThemeDefaultValue.default_background_floating_forward_button;
        this.output_background_sticker_like_and_time_color = UIThemeDefaultValue.default_background_sticker_like_and_time_color;
        this.input_background_sticker_like_and_time_color = UIThemeDefaultValue.default_background_sticker_like_and_time_color;
        this.explore_channel_followed_button_color = UIThemeDefaultValue.default_explore_channel_followed_button_color;
    }

    private void saveTheme(String str) {
        C2535a.m6888a().f8278a.edit().putString("mobi.mmdt.ott.model.pref.KEY_CURRENT_THEME_PATH", str).apply();
    }

    private void setColor(String str, boolean z) {
        C2480b.m6736b("set Color");
        String[] split = str.split("=");
        if (split.length == 2) {
            C2480b.m6736b("set Color length big than 2");
            String str2 = split[1];
            if (split[0].equals("font_name") && z) {
                this.font_name = str2;
                return;
            }
            if (str2.length() == 4 && str2.startsWith("#")) {
                char[] toCharArray = str2.toCharArray();
                String str3 = "#";
                for (int i = 1; i < toCharArray.length; i++) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str3);
                    stringBuilder.append(toCharArray[i]);
                    str3 = stringBuilder.toString();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str3);
                    stringBuilder.append(toCharArray[i]);
                    str3 = stringBuilder.toString();
                }
                str2 = str3;
            }
            if (checkColorValidity(str2)) {
                try {
                    Field declaredField = Class.forName(getClass().getName()).getDeclaredField(split[0]);
                    StringBuilder stringBuilder2 = new StringBuilder("Field Name Is:");
                    stringBuilder2.append(declaredField);
                    stringBuilder2.append(" Color IS:");
                    stringBuilder2.append(str2);
                    C2480b.m6742f(stringBuilder2.toString());
                    declaredField.setAccessible(true);
                    declaredField.setInt(this, Color.parseColor(str2));
                } catch (Throwable e) {
                    C2480b.m6737b("problem in reflection of color field", e);
                }
            } else {
                C2480b.m6736b("set Color not valid");
            }
        }
    }

    private void setFontTheme() {
        if (this.font_name != null) {
            String str = this.font_name;
            Object obj = -1;
            int hashCode = str.hashCode();
            if (hashCode != -898729016) {
                if (hashCode == 15060076) {
                    if (str.equals("IRANSansMobile-Light.ttf")) {
                        obj = null;
                    }
                }
            } else if (str.equals("NotoNaskhArabicUI-Regular.ttf")) {
                obj = 1;
            }
            switch (obj) {
                case null:
                case 1:
                    C4503a.m8197b(this.font_name);
                    break;
                default:
                    return;
            }
        }
    }

    private void setTheme(String str, boolean z) {
        File file = new File(str);
        if (file.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (true) {
                str = bufferedReader.readLine();
                if (str != null) {
                    StringBuilder stringBuilder = new StringBuilder("stheme line is:");
                    stringBuilder.append(str);
                    C2480b.m6736b(stringBuilder.toString());
                    setColor(str, z);
                } else {
                    return;
                }
            }
        }
        throw new FileNotFoundException("Theme file not found!");
    }

    public int getAccent_color() {
        return this.accent_color;
    }

    public int getBackground_floating_forward_button_color() {
        return this.background_floating_forward_button_color;
    }

    public int getBlock_background_color() {
        return this.block_background_color;
    }

    public int getBlock_text_color() {
        return this.block_text_color;
    }

    public int getBot_button_color() {
        return this.bot_button_color;
    }

    public int getBot_button_text_color() {
        return this.bot_button_text_color;
    }

    public int getButton_text_color() {
        return this.button_text_color;
    }

    public int getDate_bubble_background_color() {
        return this.date_bubble_background_color;
    }

    public int getDate_bubble_text_color() {
        return this.date_bubble_text_color;
    }

    public int getExplore_channel_followed_button_color() {
        return this.explore_channel_followed_button_color;
    }

    public int getExplore_channel_item_background_color() {
        return this.explore_channel_item_background_color;
    }

    public int getFab_ripple_color() {
        return this.fab_ripple_color;
    }

    public int getFeedback_dialog_background_color() {
        return this.feedback_dialog_background_color;
    }

    public int getFrame_view_color() {
        return this.frame_view_color;
    }

    public int getIcon_not_selected_color() {
        return this.icon_not_selected_color;
    }

    public int getIcon_toolbar_dark_color() {
        return this.icon_toolbar_dark_color;
    }

    public int getIcon_toolbar_white_color() {
        return this.icon_toolbar_white_color;
    }

    public int getInput_background_sticker_like_and_time_color() {
        return this.input_background_sticker_like_and_time_color;
    }

    public int getInput_bubble_background_color() {
        return this.input_bubble_background_color;
    }

    public int getInput_button_color() {
        return this.input_button_color;
    }

    public int getInput_button_text_color() {
        return this.input_button_text_color;
    }

    public int getInput_content_and_caption_message_text_color() {
        return this.input_content_and_caption_message_text_color;
    }

    public int getInput_duration_and_size_media_color() {
        return this.input_duration_and_size_media_color;
    }

    public int getInput_fill_like_image_color() {
        return this.input_fill_like_image_color;
    }

    public int getInput_link_message_text_color() {
        return this.input_link_message_text_color;
    }

    public int getInput_outline_like_image_color() {
        return this.input_outline_like_image_color;
    }

    public int getInput_time_and_like_message_color() {
        return this.input_time_and_like_message_color;
    }

    public int getLine_divider_color() {
        return this.line_divider_color;
    }

    public int getLine_divider_in_main_activity_color() {
        return this.line_divider_in_main_activity_color;
    }

    public int getMenu_item_white_color() {
        return this.menu_item_white_color;
    }

    public int getMute_unread_count_color() {
        return this.mute_unread_count_color;
    }

    public int getOutput_background_sticker_like_and_time_color() {
        return this.output_background_sticker_like_and_time_color;
    }

    public int getOutput_bubble_background_color() {
        return this.output_bubble_background_color;
    }

    public int getOutput_button_color() {
        return this.output_button_color;
    }

    public int getOutput_button_text_color() {
        return this.output_button_text_color;
    }

    public int getOutput_content_and_caption_message_text_color() {
        return this.output_content_and_caption_message_text_color;
    }

    public int getOutput_duration_and_size_media_color() {
        return this.output_duration_and_size_media_color;
    }

    public int getOutput_link_message_text_color() {
        return this.output_link_message_text_color;
    }

    public int getOutput_time_and_like_message_color() {
        return this.output_time_and_like_message_color;
    }

    public int getPin_image_color() {
        return this.pin_image_color;
    }

    public int getPrimary_color() {
        return this.primary_color;
    }

    public int getPrimary_dark_color() {
        return this.primary_dark_color;
    }

    public int getProgress_bar_color() {
        return this.progress_bar_color;
    }

    public int getRecycler_view_background_color() {
        return this.recycler_view_background_color;
    }

    public int getSeen_status_image_color() {
        return this.seen_status_image_color;
    }

    public int getShadow_input_bubble_chat_color() {
        return this.shadow_input_bubble_chat_color;
    }

    public int getShadow_output_bubble_chat_color() {
        return this.shadow_output_bubble_chat_color;
    }

    public int getShadow_toolbar_end_gradient_color() {
        return this.shadow_toolbar_end_gradient_color;
    }

    public int getShadow_toolbar_start_gradient_color() {
        return this.shadow_toolbar_start_gradient_color;
    }

    public int getSpacer_view_color() {
        return this.spacer_view_color;
    }

    public int getStatus_image_color() {
        return this.status_image_color;
    }

    public int getStatus_image_conversation_color() {
        return this.status_image_conversation_color;
    }

    public int getSubtitle_toolbar_color() {
        return this.subtitle_toolbar_color;
    }

    public int getSwitch_line_color() {
        return this.switch_line_color;
    }

    public int getTab_badge_text_color() {
        return this.tab_badge_text_color;
    }

    public int getTab_not_selected_gray_color() {
        return this.tab_not_selected_gray_color;
    }

    public int getTab_selected_color() {
        return this.tab_selected_color;
    }

    public int getText_primary_color() {
        return this.text_primary_color;
    }

    public int getText_primary_new_design_color() {
        return this.text_primary_new_design_color;
    }

    public int getText_primary_new_design_with_opacity_color() {
        return this.text_primary_new_design_with_opacity_color;
    }

    public int getText_secondary_color() {
        return this.text_secondary_color;
    }

    public int getTitle_profile_text_color() {
        return this.title_profile_text_color;
    }

    public int getToolbar_line_separator_color() {
        return this.toolbar_line_separator_color;
    }

    public void setDefaultTheme() {
        initDefaultColor();
        setFontTheme();
        saveTheme("default");
    }

    public void setNewTheme(String str, boolean z) {
        initDefaultColor();
        if (z) {
            setFontTheme();
        }
        setTheme(str, z);
        saveTheme(str);
    }
}
