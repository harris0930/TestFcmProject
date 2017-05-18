# FCM測試
使用 FCM 來通知 APP 有新的訊息需要同步(例如通知有新的 email )
傳送的訊息最大到 4KB 到 client App
Google 推薦之前使用 GCM 的應該換成 FCM (FCM 繼承 GCM，下層結構還是 GCM)


## 參考網站
官網教學IOS
https://firebase.google.com/docs/cloud-messaging/ios/client

FCM推播文章:http://jack120707.blogspot.tw/2016/06/google-firebasenotification-objective-c.html

官網教學Android
https://firebase.google.com/docs/cloud-messaging/android/client

FCM推播文章: https://litotom.com/2016/06/24/android-firebase-cloud-messaging-1/
 

##IOS
1.Bundle ID:產生 plist (須將此檔案放置專案內)
2.APN 憑證跟密碼:推播使用

##Android 
1.package name 和SHA1:產生 google-services.json (須將此檔案放置專案內)