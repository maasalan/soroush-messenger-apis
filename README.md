# Soroush Messenger APIs
Research on Soroush Messenger APIs and Endpoints

#Endpoints
- Web Service URL: https://wslb2.soroush-hamrah.ir/
- Stickers Service URL: https://ws-stickers2.soroush-hamrah.ir/

# Certificates
- All the found certificates are under /certs directory
# Key stores
- ssl_keystore_prod has password "b1gs3cr3t"
- use keytool as below to see the certificate detail inside the keystore:
`keytool -list -v -keystore "ssl_keystore_prod.bks" -provider org.bouncycastle.jce.provider.BouncyCastleProvider -providerpath "bcprov-jdk15on-159.jar" -storetype BKS -storepass "b1gs3cr3t"`

# Web service APIs:

- https://wslb2.soroush-hamrah.ir/CAPI/Userchat/Archive/
- https://wslb2.soroush-hamrah.ir/activation/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/addmember/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/addmember/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/changechanneldata/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/setlocations/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/changerole/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/changegroupdata/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/changerole/
- https://wslb2.soroush-hamrah.ir/Voucher/Verify/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/checkExistMembers/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/checkFreeChannelId/
- https://wslb2.soroush-hamrah.ir/Payments/check/
- https://wslb2.soroush-hamrah.ir/Checkversion/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/create/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/link_renew/
- https://wslb2.soroush-hamrah.ir/Payments/create
- https://wslb2.soroush-hamrah.ir/polls/create/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/create/
- https://wslb2.soroush-hamrah.ir/publicchat/creatRoom/
- https://wslb2.soroush-hamrah.ir/deactivation/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/deleteChannel/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/deleteChannelMessages/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/editChannelMessage/
- https://wslb2.soroush-hamrah.ir/Sessions/List/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/getmembers/
- https://wslb2.soroush-hamrah.ir/Bots/getdata/
- https://wslb2.soroush-hamrah.ir/Maps/browse/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/browse/{category_id}/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/getdata/
- https://wslb2.soroush-hamrah.ir/CAPI/Channels/InteractiveMessages/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/newMessages/json
- https://wslb2.soroush-hamrah.ir/client_country/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/groupdata/
- https://wslb2.soroush-hamrah.ir/landing/getlanding/{landing_id}/
- https://wslb2.soroush-hamrah.ir/landing/getCategoryItems/{category_id}/
- https://wslb2.soroush-hamrah.ir/like/get/
- https://wslb2.soroush-hamrah.ir/GAPI/user/getlist/
- https://wslb2.soroush-hamrah.ir/messagevisits/get/
- https://wslb2.soroush-hamrah.ir/Hey/knock/
- https://wslb2.soroush-hamrah.ir/polls/getresult/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/link_get/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/newMessages/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/getmembersinfo/
- https://wslb2.soroush-hamrah.ir/servicesdata/getProvinceCities/{id}/
- https://wslb2.soroush-hamrah.ir/Payments/echarge/start/
- https://wslb2.soroush-hamrah.ir/salam/
- https://wslb2.soroush-hamrah.ir/Payments/billpay/start/
- https://wslb2.soroush-hamrah.ir/card/
- https://wslb2.soroush-hamrah.ir/CAPI/Userchat/WindowArchive/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/archive/JSON/
- https://wslb2.soroush-hamrah.ir/CAPI/Conversation/List/
- https://wslb2.soroush-hamrah.ir/CAPI/Conversation/Updates/
- https://wslb2.soroush-hamrah.ir/CAPI/Groupchat/Archive/
- https://wslb2.soroush-hamrah.ir/CAPI/Groupchat/WindowArchive/
- https://wslb2.soroush-hamrah.ir/ivrRequest/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/join/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/join_by_token/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/leave/
- https://wslb2.soroush-hamrah.ir/GAPI/user/unsubscribe/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/leave/
- https://wslb2.soroush-hamrah.ir/linkpreview/
- https://wslb2.soroush-hamrah.ir/lookup/
- https://wslb2.soroush-hamrah.ir/membersinfo/
- https://wslb2.soroush-hamrah.ir/messagevisits/store/
- https://wslb2.soroush-hamrah.ir/Payments/trans/verify/
- https://wslb2.soroush-hamrah.ir/register/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/removemember/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/removemember/
- https://wslb2.soroush-hamrah.ir/GAPI/privatechat/link_remove/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/search/
- https://wslb2.soroush-hamrah.ir/algorithm/
- https://wslb2.soroush-hamrah.ir/FCM/send/
- https://wslb2.soroush-hamrah.ir/FCM/store/
- https://wslb2.soroush-hamrah.ir/like/send/
- https://wslb2.soroush-hamrah.ir/GAPI/channels/sendmessage/
- https://wslb2.soroush-hamrah.ir/report/
- https://wslb2.soroush-hamrah.ir/sendSMS/
- https://wslb2.soroush-hamrah.ir/setprofile
- https://wslb2.soroush-hamrah.ir/polls/vote/
- https://wslb2.soroush-hamrah.ir/Payments/trans/start/
- https://wslb2.soroush-hamrah.ir/contacts/syncall/
- https://wslb2.soroush-hamrah.ir/contacts/syncchanges/
- https://wslb2.soroush-hamrah.ir/Sessions/Terminate/

# Stickers service endpoints
- https://ws-stickers2.soroush-hamrah.ir/authentication/
- https://ws-stickers2.soroush-hamrah.ir/browse/{filter}
- https://ws-stickers2.soroush-hamrah.ir/banner/
- https://ws-stickers2.soroush-hamrah.ir/stickers/download/
- https://ws-stickers2.soroush-hamrah.ir/packages/download/{package_id}
- https://ws-stickers2.soroush-hamrah.ir/packages/view/{package_id}
- https://ws-stickers2.soroush-hamrah.ir/browse/index/
- https://ws-stickers2.soroush-hamrah.ir/browse/index/{category}
