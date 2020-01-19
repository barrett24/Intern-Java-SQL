package com.sinc.stu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentMain {

	public static void main(String[] args) {
		List<StuVO> StuAry = new ArrayList<StuVO>();
		StuAry.add(new StuVO("홍길동", 15, 170, 80));
		StuAry.add(new StuVO("한사람", 13, 180, 70));
		StuAry.add(new StuVO("임걱정", 16, 175, 65));
		
		for (StuVO line : StuAry) {
			System.out.println(line.studentInfo());
		}
		
		double ageAvg = StuAry.stream()
				.mapToInt(StuVO::getAge)
				.average()
				.getAsDouble();
		System.out.println("나이 평균: " + ageAvg);
		
		double heightAvg = StuAry.stream()
				.mapToInt(StuVO::getHeight)
				.average()
				.getAsDouble();
		System.out.println("신장 평균: " + heightAvg);
		
		double weightAvg = StuAry.stream()
				.mapToInt(StuVO::getWeight)
				.average()
				.getAsDouble();
		System.out.println("몸무게 평균: " + weightAvg);

		System.out.println("나이가 가장 많은 학생: "
				+ (StuAry.stream()
				.collect(Collectors
						.maxBy(Comparator.comparingInt(StuVO::getAge)))
				.get()).getName());

	}

}
