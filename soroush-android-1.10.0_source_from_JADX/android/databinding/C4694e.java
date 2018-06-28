package android.databinding;

import android.view.View;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p561a.C7157a;
import mobi.mmdt.ott.p561a.C7158b;
import mobi.mmdt.ott.p561a.C7159c;
import mobi.mmdt.ott.p561a.C7160d;
import mobi.mmdt.ott.p561a.C7161e;
import mobi.mmdt.ott.p561a.C7162f;
import mobi.mmdt.ott.p561a.C7163g;
import mobi.mmdt.ott.p561a.C7164h;
import mobi.mmdt.ott.p561a.C7165i;
import mobi.mmdt.ott.p561a.C7166j;

final class C4694e extends C0129d {
    public final ViewDataBinding mo49a(C0130f c0130f, View view, int i) {
        Object tag;
        StringBuilder stringBuilder;
        switch (i) {
            case R.layout.fragment_another_bill_payment:
                tag = view.getTag();
                if (tag == null) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/fragment_another_bill_payment_0".equals(tag)) {
                    return new C7157a(c0130f, view);
                } else {
                    stringBuilder = new StringBuilder("The tag for fragment_another_bill_payment is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            case R.layout.fragment_soroush_charge:
                tag = view.getTag();
                if (tag == null) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/fragment_soroush_charge_0".equals(tag)) {
                    return new C7158b(c0130f, view);
                } else {
                    stringBuilder = new StringBuilder("The tag for fragment_soroush_charge is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            case R.layout.image_suggest_channel_layout_item_list:
                tag = view.getTag();
                if (tag == null) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/image_suggest_channel_layout_item_list_0".equals(tag)) {
                    return new C7159c(c0130f, view);
                } else {
                    stringBuilder = new StringBuilder("The tag for image_suggest_channel_layout_item_list is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            case R.layout.list_item_conversations_db:
                tag = view.getTag();
                if (tag == null) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/list_item_conversations_db_0".equals(tag)) {
                    return new C7160d(c0130f, view);
                } else {
                    stringBuilder = new StringBuilder("The tag for list_item_conversations_db is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            case R.layout.list_item_floating_forward:
                tag = view.getTag();
                if (tag == null) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/list_item_floating_forward_0".equals(tag)) {
                    return new C7161e(c0130f, view);
                } else {
                    stringBuilder = new StringBuilder("The tag for list_item_floating_forward is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            case R.layout.list_item_new_design_inner_suggest_channel:
                tag = view.getTag();
                if (tag == null) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/list_item_new_design_inner_suggest_channel_0".equals(tag)) {
                    return new C7162f(c0130f, view);
                } else {
                    stringBuilder = new StringBuilder("The tag for list_item_new_design_inner_suggest_channel is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            case R.layout.list_item_new_design_suggest_category_with_recycler_view:
                tag = view.getTag();
                if (tag == null) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/list_item_new_design_suggest_category_with_recycler_view_0".equals(tag)) {
                    return new C7163g(c0130f, view);
                } else {
                    stringBuilder = new StringBuilder("The tag for list_item_new_design_suggest_category_with_recycler_view is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            case R.layout.list_item_new_design_suggest_slide_show_with_recycler_view:
                tag = view.getTag();
                if (tag == null) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/list_item_new_design_suggest_slide_show_with_recycler_view_0".equals(tag)) {
                    return new C7164h(c0130f, view);
                } else {
                    stringBuilder = new StringBuilder("The tag for list_item_new_design_suggest_slide_show_with_recycler_view is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            case R.layout.list_item_suggest_contact:
                tag = view.getTag();
                if (tag == null) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/list_item_suggest_contact_0".equals(tag)) {
                    return new C7165i(c0130f, view);
                } else {
                    stringBuilder = new StringBuilder("The tag for list_item_suggest_contact is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            case R.layout.slider_banner_layout_item_list:
                tag = view.getTag();
                if (tag == null) {
                    throw new RuntimeException("view must have a tag");
                } else if ("layout/slider_banner_layout_item_list_0".equals(tag)) {
                    return new C7166j(c0130f, view);
                } else {
                    stringBuilder = new StringBuilder("The tag for slider_banner_layout_item_list is invalid. Received: ");
                    stringBuilder.append(tag);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            default:
                return null;
        }
    }
}
