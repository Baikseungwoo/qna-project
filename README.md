# 💬 qna-project

> Java와 Spring Boot로 만들어 본 Q&A 게시판 백엔드 학습 프로젝트

`qna-project`는 질문과 답변을 중심으로 한 게시판 서비스의 기본 구조를 직접 구현해 보며, Spring Boot 백엔드 애플리케이션의 흐름을 익히기 위해 만든 프로젝트입니다.  
웹 요청이 들어온 뒤 `Controller → Service → Repository` 계층을 거쳐 처리되는 과정을 이해하는 데 초점을 두었습니다.

<br />

## 📌 프로젝트 소개

이 레포지토리는 Spring Boot 기반 웹 애플리케이션을 처음부터 구성하며 백엔드 개발의 기본기를 연습하기 위해 만들었습니다.

단순한 게시판 예제이지만, 실제 서비스에서 자주 사용되는 계층 분리 방식, Gradle 기반 프로젝트 구조, Java 백엔드 애플리케이션의 실행 흐름을 직접 다뤄 보는 것을 목표로 했습니다.

처음 보는 사람도 이 레포지토리를 보면 다음 내용을 파악할 수 있도록 구성했습니다.

- Java/Spring 기반 서버 프로젝트의 기본 구조
- 게시판 서비스에서 질문과 답변 도메인이 나뉘는 방식
- 요청 처리 로직과 비즈니스 로직을 분리하는 이유
- Gradle을 이용해 Spring Boot 프로젝트를 실행하는 방법

<br />

## ✨ 주요 기능

- 📝 질문과 답변을 중심으로 한 게시판 도메인 구성
- 🌱 Spring Boot 애플리케이션 기본 구조 실습
- 🔀 Controller를 통한 요청 처리 흐름 이해
- 🧩 Service 계층을 통한 비즈니스 로직 분리 연습
- 🗂️ Repository 계층을 통한 데이터 접근 구조 학습
- ⚙️ Gradle Wrapper를 이용한 프로젝트 실행 환경 구성

<br />

## 🛠️ 기술 스택

| 구분 | 사용 기술 |
| --- | --- |
| Language | Java |
| Framework | Spring Boot |
| Build Tool | Gradle |
| Version Control | Git, GitHub |

<br />

## 📁 폴더 구조

```text
qna-project/
├── gradle/wrapper/      # Gradle Wrapper 설정
├── src/                 # 애플리케이션 소스 코드
├── build.gradle         # 프로젝트 의존성 및 빌드 설정
├── settings.gradle      # Gradle 프로젝트 설정
├── gradlew              # Linux/macOS 실행 스크립트
└── gradlew.bat          # Windows 실행 스크립트
```

<br />

## 🚀 실행 방법

프로젝트를 클론한 뒤 루트 디렉터리에서 아래 명령어를 실행합니다.

```bash
./gradlew bootRun
```

Windows 환경에서는 다음 명령어를 사용할 수 있습니다.

```bash
gradlew.bat bootRun
```

<br />

## 🧠 학습 포인트

이 프로젝트를 진행하며 다음 내용을 중심으로 학습했습니다.

- Spring Boot 프로젝트의 기본 실행 흐름 이해
- 웹 요청이 각 계층을 거쳐 처리되는 구조 학습
- Java 기반 백엔드 프로젝트의 디렉터리 구성 파악
- Gradle을 이용한 빌드와 실행 방식 연습
- 게시판 서비스에서 도메인, 요청 처리, 데이터 접근이 분리되는 방식 이해

<br />

## 🔧 개선 예정

- 질문/답변 CRUD 기능 고도화
- 예외 처리와 입력값 검증 추가
- 데이터베이스 연동 구조 정리
- 화면 템플릿 또는 API 문서 보강
- 테스트 코드 추가

<br />

## ✅ 한 줄 정리

> Spring Boot 백엔드의 기본 구조를 직접 만들어 보며, 게시판 서비스의 핵심 흐름을 익히기 위한 Q&A 프로젝트입니다.
