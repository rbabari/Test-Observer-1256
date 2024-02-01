```mermaid
classDiagram
direction BT
class IObservable {
<<Interface>>
  + supprimer(IObserver) void
  + CompterObservers() int
  + ajoute(IObserver) void
  + NotifierTout(Message) void
}
class IObserver {
<<Interface>>
  + update(Message) void
}
class Main {
  + Main() 
  + main(String[]) void
}
class Message {
  + Message(String) 
  - String messageContent
   String messageContent
}
class MessagePublisher1 {
  + MessagePublisher1() 
  + supprimer(IObserver) void
  + CompterObservers() int
  + ajoute(IObserver) void
  + NotifierTout(Message) void
}
class MessagePublisher2 {
  + MessagePublisher2() 
  + ajoute(IObserver) void
  + supprimer(IObserver) void
  + NotifierTout(Message) void
  + CompterObservers() int
}
class MessageSubscriber1 {
  + MessageSubscriber1() 
  + update(Message) void
}
class MessageSubscriber2 {
  + MessageSubscriber2() 
  + update(Message) void
}

Main  ..>  Message : «create»
Main  ..>  MessagePublisher1 : «create»
Main  ..>  MessageSubscriber1 : «create»
Main  ..>  MessageSubscriber2 : «create»
MessagePublisher1  ..>  IObservable 
MessagePublisher1 "1" *--> "observersList *" IObserver 
MessagePublisher2  ..>  IObservable 
MessagePublisher2 "1" *--> "observersList *" IObserver 
MessageSubscriber1  ..>  IObserver 
MessageSubscriber2  ..>  IObserver 
```
