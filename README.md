## Functional interface + lamda + stream study project
![Static Badge](https://img.shields.io/badge/java-v1.8_or_Later-blue)

# Functional interface
- 오직 하나의 추상 메서드만을 갖는 인터페이스
- @FunctionalInterface (생략 가능)

## :heavy_check_mark: Chapter1.Function
- parameter type, return type 설정
- apply method
  
## :heavy_check_mark: Chapter2.Supplier
- return type 설정
- get method
  
## :heavy_check_mark: Chapter3.Consumer
- parameter type 설정
- accept method
  
## :heavy_check_mark: Chapter4.Predicate
- parameter type 설정, return boolean type
- test method
  
## :heavy_check_mark: Chapter5.Comparator
- 정렬(비교) 시 활용
- Comparator.comparing()
- 음수이면 value1 < value2
- 0이면 value1 = value2
- 양수이면 value1 > value2

# Lamda expression
- parameter type 이 유추될 경우 생략
- single parameter 의 경우 괄호 생략
- 바로 리턴하는 경우 중괄호 생략
