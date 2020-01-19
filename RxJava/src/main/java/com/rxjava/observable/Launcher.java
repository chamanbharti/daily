package com.rxjava.observable;

import io.reactivex.Observable;

public class Launcher {
	
	public static void main(String[] args) {
		
//		Observable<String> source = Observable.create(emitter ->{
//			emitter.onNext("Alpha");
//			emitter.onNext("Beta");
//			emitter.onNext("Gamma");
//			emitter.onNext("Delta");
//			emitter.onNext("Epsilon");
//			emitter.onComplete();
//		});
//		
//		source.subscribe(s->System.out.println("Recieved: "+s));
//		
		Observable<String> source = Observable.create(emitter ->{
			try {
				emitter.onNext("Alpha");
				emitter.onNext("Beta");
				emitter.onNext("Gamma");
				emitter.onNext("Delta");
				emitter.onNext("Epsilon");
				emitter.onComplete();
			} catch (Exception e) {
				emitter.onError(e);
			}
		});
		
		source.subscribe(s->System.out.println("Recieved: "+s), Throwable::printStackTrace);
	}

}
