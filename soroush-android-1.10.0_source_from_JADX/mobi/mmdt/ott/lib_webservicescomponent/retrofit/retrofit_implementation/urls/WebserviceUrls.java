package mobi.mmdt.ott.lib_webservicescomponent.retrofit.retrofit_implementation.urls;

//TODO: URLS (Bamdad)

import com.google.p164b.C1944k;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.activation.ActivationRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.activation.ActivationResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.algorithm.AlgorithmRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.algorithm.AlgorithmResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.bot.get_bot_data.GetBotDataRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.bot.get_bot_data.GetBotDataResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.list.ConversationListRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.list.ConversationListResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.update.ConversationListUpdateRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.Conversation.update.ConversationListUpdateResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.groupchat.archive.GroupChatArchiveRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.groupchat.archive.GroupChatArchiveResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.groupchat.windowsarchive.WindowsGroupArchiveRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.groupchat.windowsarchive.WindowsGroupArchiveResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.userchat.archive.UserChatArchiveRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.userchat.archive.UserChatArchiveResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.card.GetUserChargeRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.card.GetUserChargeResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.checkversion.CheckVersionRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.checkversion.CheckVersionResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.clientCountry.ClientCountryResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.syncall.SyncAllRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.syncall.SyncAllResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.syncchanges.SyncChangeRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.contacts.syncchanges.SyncChangeResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.deactivation.DeactivationRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.deactivation.DeactivationResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.sendmessage.SendFCMMessageRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.sendmessage.SendFCMMessageResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.sendtoken.SendFCMTokenRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.fcm.sendtoken.SendFCMTokenResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.get_new_username.GetNewUserNameRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.get_new_username.GetNewUserNameResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.addmember.AddMemberToChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.addmember.AddMemberToChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.browse_map_location.GetBrowseMapLocationsRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.browse_map_location.GetBrowseMapLocationsResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.change_channel_location.ChangeChannelLocationsRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.change_channel_location.ChangeChannelLocationsResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.changechannelinfo.ChangeChannelInformationRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.changechannelinfo.ChangeChannelInformationResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.changememberrole.ChangeMemberRoleInChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.changememberrole.ChangeMemberRoleInChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channel_member.GetAllChannelMembersRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channel_member.GetAllChannelMembersResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channelarchive.GetChannelArchiveRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channelarchive.GetChannelArchiveResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channelinfo.GetChannelInfoRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.channelinfo.GetChannelInfoResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.check_members_exist.CheckExistMemberInChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.check_members_exist.CheckExistMemberInChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.checkfreechannelid.CheckFreeChannelIdRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.checkfreechannelid.CheckFreeChannelIdResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.create.CreateChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.create.CreateChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.deletechannel.DeleteChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.deletechannel.DeleteChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.deletechannelmessages.DeleteChannelMessagesRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.deletechannelmessages.DeleteChannelMessagesResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.edit_message_channel.EditChannelMessageRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.edit_message_channel.EditChannelMessageResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.get_category_and_channels.GetCategoryAndChannelsRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.get_category_and_channels.GetCategoryAndChannelsResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.intractive_message.GetChannelInteractiveMessageRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.intractive_message.GetChannelInteractiveMessageResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.joinchannel.JoinChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.joinchannel.JoinChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.leavechannel.LeaveChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.leavechannel.LeaveChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.new_channel_message.GetChannelNewMessageRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.new_channel_message.GetChannelNewMessageResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.create_poll.CreatePollRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.create_poll.CreatePollResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.get_result.GetPollResultRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.get_result.GetPollResultResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.set_vote.SetVoteRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.poll.set_vote.SetVoteResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.removemember.RemoveMemberFromChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.removemember.RemoveMemberFromChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.search_channel.SearchChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.search_channel.SearchChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.sendnewmessage.SendNewMessageToChannelRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.sendnewmessage.SendNewMessageToChannelResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.leaveallchannelandgroups.LeaveFromChannelAndGroupRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.leaveallchannelandgroups.LeaveFromChannelAndGroupResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.addmember.AddMemberToPrivateGroupRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.addmember.AddMemberToPrivateGroupResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.changegroupdata.ChangePrivateGroupDataRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.changegroupdata.ChangePrivateGroupDataResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.changerole.ChangeMemberRolePrivateGroupRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.changerole.ChangeMemberRolePrivateGroupResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.create.PrivateChatCreateRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.create.PrivateChatCreateResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.createlink.CreatePrivateGroupNewLinkRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.createlink.CreatePrivateGroupNewLinkResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getlink.GetPrivateGroupLinkRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getlink.GetPrivateGroupLinkResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getmemberjoingroups.GetMemberJoinGroupListRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getmemberjoingroups.GetMemberJoinGroupListResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getnewmessagearchive.GetPrivateGroupNewMessageArchiveRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getnewmessagearchive.GetPrivateGroupNewMessageArchiveResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getprofilemembersinfo.GetProfileMembersInfoInPrivateChatRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.getprofilemembersinfo.GetProfileMembersInfoInPrivateChatResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.groupinfo.GroupInfoRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.groupinfo.GroupInfoResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.jointoprivategroupwithlink.JoinToPrivateGroupWithLinkRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.jointoprivategroupwithlink.JoinToPrivateGroupWithLinkResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.leavegroup.LeaveFromPrivateGroupRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.leavegroup.LeaveFromPrivateGroupResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.removelink.RemovePrivateGroupLinkRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.removelink.RemovePrivateGroupLinkResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.removemember.RemoveMemberFromGroupRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.privatechat.removemember.RemoveMemberFromGroupResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ivrRequest.IvrRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.ivrRequest.IvrResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.get_category_items.GetCategoryItemsRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.get_category_items.GetCategoryItemsResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.get_landing_page.GetLandingPageRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.landing_page.get_landing_page.GetLandingPageResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.get_like.GetLikeRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.get_like.GetLikeResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.send.SendLikeRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.like.send.SendLikeResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.linkpreview.LinkPreviewRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.linkpreview.LinkPreviewResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.LookupLinkRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.lookup.LookupLinkResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.memberinfo.MemberInfoRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.memberinfo.MemberInfoResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.messagevisit.store.MessageVisitStoreRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.messagevisit.store.MessageVisitStoreResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.check.CheckPaymentRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.check.CheckPaymentResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.create.CreatePaymentRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.create.CreatePaymentResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.start_bill_pay.StartBilPayRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.start_bill_pay.StartBilPayResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.startpay.StartPaymentRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.startpay.StartPaymentResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.validation.PaymentValidationRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.payment.validation.PaymentValidationResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.register.RegisterRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.register.RegisterResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report.SendReportRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.report.SendReportResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.room.createroom.CreateRoomRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.room.createroom.CreateRoomResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.salam.SalamRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.salam.SalamResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sendSms.SendSmsRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sendSms.SendSmsResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.list.SessionListRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.list.SessionListResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.terminate.SessionTerminateRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.sessions.terminate.SessionTerminateResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.setprofile.SetProfileRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.setprofile.SetProfileResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.user_window_archive.UserWindowArchiveRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.user_window_archive.UserWindowArchiveResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.purchase_charge.PurchaseChargeRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.vas_webservices.purchase_charge.PurchaseChargeResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.visit.get_visit.GetMessageVisitRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.visit.get_visit.GetMessageVisitResponse;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.voucher.verify.ChargeVoucherRequest;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.voucher.verify.ChargeVoucherResponse;
import p207e.C2305b;
import p207e.p208b.C2281a;
import p207e.p208b.C2286f;
import p207e.p208b.C2295o;
import p207e.p208b.C2299s;

public interface WebserviceUrls {
    @C2295o(a = "CAPI/Userchat/Archive/")
    C2305b<UserChatArchiveResponse> UserMessageArchive(@C2281a UserChatArchiveRequest userChatArchiveRequest);

    @C2295o(a = "activation/")
    C2305b<ActivationResponse> activation(@C2281a ActivationRequest activationRequest);

    @C2295o(a = "GAPI/privatechat/addmember/")
    C2305b<AddMemberToPrivateGroupResponse> addMemberPrivateGroup(@C2281a AddMemberToPrivateGroupRequest addMemberToPrivateGroupRequest);

    @C2295o(a = "GAPI/channels/addmember/")
    C2305b<AddMemberToChannelResponse> addMemberToChannel(@C2281a AddMemberToChannelRequest addMemberToChannelRequest);

    @C2295o(a = "GAPI/channels/changechanneldata/")
    C2305b<ChangeChannelInformationResponse> changeChannelInformation(@C2281a ChangeChannelInformationRequest changeChannelInformationRequest);

    @C2295o(a = "GAPI/channels/setlocations/")
    C2305b<ChangeChannelLocationsResponse> changeChannelLocations(@C2281a ChangeChannelLocationsRequest changeChannelLocationsRequest);

    @C2295o(a = "GAPI/channels/changerole/")
    C2305b<ChangeMemberRoleInChannelResponse> changeMemberRoleInChannel(@C2281a ChangeMemberRoleInChannelRequest changeMemberRoleInChannelRequest);

    @C2295o(a = "GAPI/privatechat/changegroupdata/")
    C2305b<ChangePrivateGroupDataResponse> changePrivateGroupData(@C2281a ChangePrivateGroupDataRequest changePrivateGroupDataRequest);

    @C2295o(a = "GAPI/privatechat/changerole/")
    C2305b<ChangeMemberRolePrivateGroupResponse> changeRoleMemberFromPrivateGroup(@C2281a ChangeMemberRolePrivateGroupRequest changeMemberRolePrivateGroupRequest);

    @C2295o(a = "Voucher/Verify/")
    C2305b<ChargeVoucherResponse> chargeVoucher(@C2281a ChargeVoucherRequest chargeVoucherRequest);

    @C2295o(a = "GAPI/channels/checkExistMembers/")
    C2305b<CheckExistMemberInChannelResponse> checkExistMemberInChannel(@C2281a CheckExistMemberInChannelRequest checkExistMemberInChannelRequest);

    @C2295o(a = "GAPI/channels/checkFreeChannelId/")
    C2305b<CheckFreeChannelIdResponse> checkFreeChannelId(@C2281a CheckFreeChannelIdRequest checkFreeChannelIdRequest);

    @C2295o(a = "Payments/check/")
    C2305b<CheckPaymentResponse> checkPayment(@C2281a CheckPaymentRequest checkPaymentRequest);

    @C2295o(a = "Checkversion/")
    C2305b<CheckVersionResponse> checkVersion(@C2281a CheckVersionRequest checkVersionRequest);

    @C2295o(a = "GAPI/channels/create/")
    C2305b<CreateChannelResponse> createChannel(@C2281a CreateChannelRequest createChannelRequest);

    @C2295o(a = "GAPI/privatechat/link_renew/")
    C2305b<CreatePrivateGroupNewLinkResponse> createNewPrivateGroupLink(@C2281a CreatePrivateGroupNewLinkRequest createPrivateGroupNewLinkRequest);

    @C2295o(a = "Payments/create/"
    C2305b<CreatePaymentResponse> createPayment(@C2281a CreatePaymentRequest createPaymentRequest);

    @C2295o(a = "polls/create/")
    C2305b<CreatePollResponse> createPoll(@C2281a CreatePollRequest createPollRequest);

    @C2295o(a = "GAPI/privatechat/create/")
    C2305b<PrivateChatCreateResponse> createPrivateGroup(@C2281a PrivateChatCreateRequest privateChatCreateRequest);

    @C2295o(a = "publicchat/creatRoom/")
    C2305b<CreateRoomResponse> createRoom(@C2281a CreateRoomRequest createRoomRequest);

    @C2295o(a = "deactivation/")
    C2305b<DeactivationResponse> deactivation(@C2281a DeactivationRequest deactivationRequest);

    @C2295o(a = "GAPI/channels/deleteChannel/")
    C2305b<DeleteChannelResponse> deleteChannel(@C2281a DeleteChannelRequest deleteChannelRequest);

    @C2295o(a = "GAPI/channels/deleteChannelMessages/")
    C2305b<DeleteChannelMessagesResponse> deleteChannelMessages(@C2281a DeleteChannelMessagesRequest deleteChannelMessagesRequest);

    @C2295o(a = "GAPI/channels/editChannelMessage/")
    C2305b<EditChannelMessageResponse> editChannelMessage(@C2281a EditChannelMessageRequest editChannelMessageRequest);

    @C2295o(a = "Sessions/List/")
    C2305b<SessionListResponse> getActiveSessionList(@C2281a SessionListRequest sessionListRequest);

    @C2295o(a = "GAPI/channels/getmembers/")
    C2305b<GetAllChannelMembersResponse> getAllChannelMembers(@C2281a GetAllChannelMembersRequest getAllChannelMembersRequest);

    @C2295o(a = "Bots/getdata/")
    C2305b<GetBotDataResponse> getBotData(@C2281a GetBotDataRequest getBotDataRequest);

    @C2295o(a = "Maps/browse/")
    C2305b<GetBrowseMapLocationsResponse> getBrowseMapLocations(@C2281a GetBrowseMapLocationsRequest getBrowseMapLocationsRequest);

    @C2295o(a = "GAPI/channels/browse/{category_id}/")
    C2305b<GetCategoryAndChannelsResponse> getCategoryAndChannels(@C2281a GetCategoryAndChannelsRequest getCategoryAndChannelsRequest, @C2299s(a = "category_id", b = true) String str);

    @C2295o(a = "GAPI/channels/getdata/")
    C2305b<GetChannelInfoResponse> getChannelInfo(@C2281a GetChannelInfoRequest getChannelInfoRequest);

    @C2295o(a = "CAPI/Channels/InteractiveMessages/")
    C2305b<GetChannelInteractiveMessageResponse> getChannelInteractiveMessage(@C2281a GetChannelInteractiveMessageRequest getChannelInteractiveMessageRequest);

    @C2295o(a = "GAPI/channels/newMessages/json")
    C2305b<GetChannelNewMessageResponse> getChannelsNewMessage(@C2281a GetChannelNewMessageRequest getChannelNewMessageRequest);

    @C2286f(a = "client_country/")
    C2305b<ClientCountryResponse> getCountry();

    @C2295o(a = "GAPI/privatechat/groupdata/")
    C2305b<GroupInfoResponse> getGroupInfo(@C2281a GroupInfoRequest groupInfoRequest);

    @C2295o(a = "landing/getlanding/{landing_id}/")
    C2305b<GetLandingPageResponse> getLandingPage(@C2281a GetLandingPageRequest getLandingPageRequest, @C2299s(a = "landing_id", b = true) String str);

    @C2295o(a = "landing/getCategoryItems/{category_id}/")
    C2305b<GetCategoryItemsResponse> getLandingPageCategoryItems(@C2281a GetCategoryItemsRequest getCategoryItemsRequest, @C2299s(a = "category_id", b = true) String str);

    @C2295o(a = "like/get/")
    C2305b<GetLikeResponse> getLike(@C2281a GetLikeRequest getLikeRequest);

    @C2295o(a = "GAPI/user/getlist/")
    C2305b<GetMemberJoinGroupListResponse> getMemberJoinGroupsList(@C2281a GetMemberJoinGroupListRequest getMemberJoinGroupListRequest);

    @C2295o(a = "messagevisits/get/")
    C2305b<GetMessageVisitResponse> getMessageVisit(@C2281a GetMessageVisitRequest getMessageVisitRequest);

    @C2295o(a = "Hey/knock/")
    C2305b<GetNewUserNameResponse> getNewUserName(@C2281a GetNewUserNameRequest getNewUserNameRequest);

    @C2295o(a = "polls/getresult/")
    C2305b<GetPollResultResponse> getPollResult(@C2281a GetPollResultRequest getPollResultRequest);

    @C2295o(a = "GAPI/privatechat/link_get/")
    C2305b<GetPrivateGroupLinkResponse> getPrivateGroupLink(@C2281a GetPrivateGroupLinkRequest getPrivateGroupLinkRequest);

    @C2295o(a = "GAPI/privatechat/newMessages/")
    C2305b<GetPrivateGroupNewMessageArchiveResponse> getPrivateGroupNewMessageArchive(@C2281a GetPrivateGroupNewMessageArchiveRequest getPrivateGroupNewMessageArchiveRequest);

    @C2295o(a = "GAPI/privatechat/getmembersinfo/")
    C2305b<GetProfileMembersInfoInPrivateChatResponse> getProfileMembersInfo(@C2281a GetProfileMembersInfoInPrivateChatRequest getProfileMembersInfoInPrivateChatRequest);

    @C2286f(a = "servicesdata/getProvinceCities/{id}/")
    C2305b<C1944k> getProvinceCity(@C2299s(a = "id", b = true) String str);

    @C2295o(a = "Payments/echarge/start/")
    C2305b<PurchaseChargeResponse> getPurchaseCharge(@C2281a PurchaseChargeRequest purchaseChargeRequest);

    @C2295o(a = "salam/")
    C2305b<SalamResponse> getSalam(@C2281a SalamRequest salamRequest);

    @C2295o(a = "Payments/billpay/start/")
    C2305b<StartBilPayResponse> getStartBilPay(@C2281a StartBilPayRequest startBilPayRequest);

    @C2295o(a = "card/")
    C2305b<GetUserChargeResponse> getUserCharge(@C2281a GetUserChargeRequest getUserChargeRequest);

    @C2295o(a = "CAPI/Userchat/WindowArchive/")
    C2305b<UserWindowArchiveResponse> getUserWindowArchive(@C2281a UserWindowArchiveRequest userWindowArchiveRequest);

    @C2295o(a = "GAPI/channels/archive/JSON/")
    C2305b<GetChannelArchiveResponse> getchannelArchive(@C2281a GetChannelArchiveRequest getChannelArchiveRequest);

    @C2295o(a = "CAPI/Conversation/List/")
    C2305b<ConversationListResponse> getconversationList(@C2281a ConversationListRequest conversationListRequest);

    @C2295o(a = "CAPI/Conversation/Updates/")
    C2305b<ConversationListUpdateResponse> getconversationListUpdate(@C2281a ConversationListUpdateRequest conversationListUpdateRequest);

    @C2295o(a = "CAPI/Groupchat/Archive/")
    C2305b<GroupChatArchiveResponse> groupChatArchive(@C2281a GroupChatArchiveRequest groupChatArchiveRequest);

    @C2295o(a = "CAPI/Groupchat/WindowArchive/")
    C2305b<WindowsGroupArchiveResponse> groupChatArchiveWindows(@C2281a WindowsGroupArchiveRequest windowsGroupArchiveRequest);

    @C2295o(a = "ivrRequest/")
    C2305b<IvrResponse> ivrRequest(@C2281a IvrRequest ivrRequest);

    @C2295o(a = "GAPI/channels/join/")
    C2305b<JoinChannelResponse> joinChannel(@C2281a JoinChannelRequest joinChannelRequest);

    @C2295o(a = "GAPI/privatechat/join_by_token/")
    C2305b<JoinToPrivateGroupWithLinkResponse> joinToPrivateGroupWithLink(@C2281a JoinToPrivateGroupWithLinkRequest joinToPrivateGroupWithLinkRequest);

    @C2295o(a = "GAPI/channels/leave/")
    C2305b<LeaveChannelResponse> leaveChannel(@C2281a LeaveChannelRequest leaveChannelRequest);

    @C2295o(a = "GAPI/user/unsubscribe/")
    C2305b<LeaveFromChannelAndGroupResponse> leaveFromALlGroupsAndChannel(@C2281a LeaveFromChannelAndGroupRequest leaveFromChannelAndGroupRequest);

    @C2295o(a = "GAPI/privatechat/leave/")
    C2305b<LeaveFromPrivateGroupResponse> leaveFromPrivateGroup(@C2281a LeaveFromPrivateGroupRequest leaveFromPrivateGroupRequest);

    @C2295o(a = "linkpreview/")
    C2305b<LinkPreviewResponse> linkPreview(@C2281a LinkPreviewRequest linkPreviewRequest);

    @C2295o(a = "lookup/")
    C2305b<LookupLinkResponse> lookupLink(@C2281a LookupLinkRequest lookupLinkRequest);

    @C2295o(a = "membersinfo/")
    C2305b<MemberInfoResponse> memberInfo(@C2281a MemberInfoRequest memberInfoRequest);

    @C2295o(a = "messagevisits/store/")
    C2305b<MessageVisitStoreResponse> messageVisitSore(@C2281a MessageVisitStoreRequest messageVisitStoreRequest);

    @C2295o(a = "Payments/trans/verify/")
    C2305b<PaymentValidationResponse> paymentValidation(@C2281a PaymentValidationRequest paymentValidationRequest);

    @C2295o(a = "register/")
    C2305b<RegisterResponse> registerClient(@C2281a RegisterRequest registerRequest);

    @C2295o(a = "GAPI/channels/removemember/")
    C2305b<RemoveMemberFromChannelResponse> removeMemberFromChannel(@C2281a RemoveMemberFromChannelRequest removeMemberFromChannelRequest);

    @C2295o(a = "GAPI/privatechat/removemember/")
    C2305b<RemoveMemberFromGroupResponse> removeMemberFromGroup(@C2281a RemoveMemberFromGroupRequest removeMemberFromGroupRequest);

    @C2295o(a = "GAPI/privatechat/link_remove/")
    C2305b<RemovePrivateGroupLinkResponse> removePrivateGroupLink(@C2281a RemovePrivateGroupLinkRequest removePrivateGroupLinkRequest);

    @C2295o(a = "GAPI/channels/search/")
    C2305b<SearchChannelResponse> searchChannel(@C2281a SearchChannelRequest searchChannelRequest);

    @C2295o(a = "algorithm/")
    C2305b<AlgorithmResponse> sendAlgorithms(@C2281a AlgorithmRequest algorithmRequest);

    @C2295o(a = "FCM/send/")
    C2305b<SendFCMMessageResponse> sendFCMMessage(@C2281a SendFCMMessageRequest sendFCMMessageRequest);

    @C2295o(a = "FCM/store/")
    C2305b<SendFCMTokenResponse> sendFCMToken(@C2281a SendFCMTokenRequest sendFCMTokenRequest);

    @C2295o(a = "like/send/")
    C2305b<SendLikeResponse> sendLike(@C2281a SendLikeRequest sendLikeRequest);

    @C2295o(a = "GAPI/channels/sendmessage/")
    C2305b<SendNewMessageToChannelResponse> sendNewMessageToChannel(@C2281a SendNewMessageToChannelRequest sendNewMessageToChannelRequest);

    @C2295o(a = "report/")
    C2305b<SendReportResponse> sendReport(@C2281a SendReportRequest sendReportRequest);

    @C2295o(a = "sendSMS/")
    C2305b<SendSmsResponse> sendSMS(@C2281a SendSmsRequest sendSmsRequest);

    @C2295o(a = "setprofile")
    C2305b<SetProfileResponse> setProfile(@C2281a SetProfileRequest setProfileRequest);

    @C2295o(a = "polls/vote/")
    C2305b<SetVoteResponse> setVote(@C2281a SetVoteRequest setVoteRequest);

    @C2295o(a = "Payments/trans/start/")
    C2305b<StartPaymentResponse> startPayment(@C2281a StartPaymentRequest startPaymentRequest);

    @C2295o(a = "contacts/syncall/")
    C2305b<SyncAllResponse> syncAllRequest(@C2281a SyncAllRequest syncAllRequest);

    @C2295o(a = "contacts/syncchanges/")
    C2305b<SyncChangeResponse> syncChange(@C2281a SyncChangeRequest syncChangeRequest);

    @C2295o(a = "Sessions/Terminate/")
    C2305b<SessionTerminateResponse> terminateSession(@C2281a SessionTerminateRequest sessionTerminateRequest);
}
