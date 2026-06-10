# 🛒 Java Shopping List

콘솔 기반 장보기 목록 관리 프로젝트입니다.  
사용자가 장보기 목록을 추가/삭제/완료 처리할 수 있는 CLI 기반 애플리케이션입니다.

---

# 📌 주요 기능

- 장보기 목록 조회
- 물품 추가
- 물품 삭제
- 물품 구매 완료 처리

---

# 🧰 사용 기술

- Java
- ArrayList
- MVC Pattern
- Exception Handling
- Scanner
- OOP (Object-Oriented Programming)

---

# 🧩 프로젝트 구조

- **ShoppingList** : 장보기 데이터 관리 (Model)
- **View** : 화면 출력 담당
- **Controller** : 비즈니스 로직 처리
- **CommandHandler** : 사용자 명령어 처리
- **ShoppingApp** : 프로그램 시작점

---

# ⌨️ 명령어

| 명령어 | 설명 |
|--------|------|
| `list` | 장보기 목록 조회 |
| `add 물품명` | 물품 추가 |
| `buy 번호` | 구매 완료 처리 |
| `drop 번호` | 물품 삭제 |
| `end` | 프로그램 종료 |

---

# 🚀 실행 예시

```bash
shopping> list

- 장보기 목록
1. 우유
2. 계란
3. 사과

shopping> add 바나나

shopping> buy 2

shopping> drop 1

shopping> end