package com.np.kd.spring.album;

import org.springframework.stereotype.Component;

@Component
public class BhedaKoUnJsto implements CompactDisc {
	private final String title = "Simana";
	private final String artist = "Nepathya";

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Now playing " + title + " by " + artist);
	}

}
