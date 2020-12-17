package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double post = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge()>=40)
                .mapToInt(p -> p.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(post);

        double post2 = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() <40)
                .mapToInt(p -> p.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(post2);
    }
}
