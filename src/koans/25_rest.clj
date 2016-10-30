(ns koans.25-rest
  (:require [koan-engine.core :refer :all]))

(meditations
 "Unknown pearls from the Clojure standard library - Renzo Borgatti
 https://youtu.be/QI9Fc5TT87A"
 (= '(0 1 3 6 10) (reductions + (range 5)))

 ;; (clojure.java.browse/browse-url "http://localhost:3000")

 "Say it aloud!"
 (= "one hundred twenty-third"
    (clojure.pprint/cl-format nil "~:r" 123))

 ;; (clojure.java.javadoc/javadoc (list* 1 []))
 )
