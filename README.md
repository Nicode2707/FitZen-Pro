<div align="center">

<img src="https://img.shields.io/badge/FITZEN-PRO-FF5A1F?style=for-the-badge&labelColor=1C1C1E" height="46" alt="FitZen Pro"/>

### Your Personal Fitness Companion 💪

A full-stack fitness tracking platform — workouts, meals, sleep, water, and goals — in one clean dashboard.

[![Live Demo](https://img.shields.io/badge/🚀_Live_Demo-fit--zen--pro.vercel.app-FF5A1F?style=for-the-badge)](https://fit-zen-pro.vercel.app)
[![Backend](https://img.shields.io/badge/⚙️_API-fitzen--pro.onrender.com-1C1C1E?style=for-the-badge)](https://fitzen-pro.onrender.com)

<br/>

![GitHub stars](https://img.shields.io/github/stars/Nicode2707/FitZen-Pro?style=flat-square&color=FF5A1F)
![GitHub forks](https://img.shields.io/github/forks/Nicode2707/FitZen-Pro?style=flat-square&color=FF5A1F)
![GitHub issues](https://img.shields.io/github/issues/Nicode2707/FitZen-Pro?style=flat-square&color=FF5A1F)
![GitHub license](https://img.shields.io/github/license/Nicode2707/FitZen-Pro?style=flat-square&color=FF5A1F)

![Java](https://img.shields.io/badge/Java_17-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot_3-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=flat-square&logo=springsecurity&logoColor=white)
![React](https://img.shields.io/badge/React_19-61DAFB?style=flat-square&logo=react&logoColor=black)
![Vite](https://img.shields.io/badge/Vite-646CFF?style=flat-square&logo=vite&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-000000?style=flat-square&logo=jsonwebtokens&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white)

</div>

<br/>

## 📖 Overview

FitZen Pro is a secure, responsive fitness tracker built to replace the "one app per habit" problem. Instead of juggling separate apps for workouts, meals, sleep, and goals, everything lives on one dashboard, backed by JWT-authenticated REST APIs and a MySQL database.

**Frontend** (React + Vite) and **backend** (Spring Boot + Spring Security) run as independent services, communicating over REST — a clean, cloud-deployable, production-style architecture.

## ❓ Why FitZen Pro

| Problem | FitZen Pro's Answer |
|----|----|
| Fitness data scattered across multiple apps | One dashboard for workouts, meals, sleep, water & goals |
| Weak or session-based auth in hobby projects | Real JWT auth + Spring Security + BCrypt password hashing |
| Static, table-heavy trackers | Interactive charts, progress bars, animated dashboard |
| Frontend/backend tightly coupled | Fully decoupled React SPA ↔ Spring Boot REST API |

## ✨ Features

<table>
<tr>
<td valign="top" width="50%">

**🔐 Authentication**
- JWT-based login & registration
- BCrypt password encryption
- Spring Security–protected routes

**📊 Dashboard**
- Weekly activity graph
- Water intake progress
- Sleep summary & calories burned
- Steps counter, daily goals

**💪 Workouts**
- Log workouts by category
- Exercise history
- Daily progress tracking

</td>
<td valign="top" width="50%">

**🍎 Meals**
- Meal logging & calorie tracking
- Daily nutrition records

**😴 Sleep**
- Sleep hours & quality logging
- Sleep statistics

**🎯 Goals**
- Create & track fitness goals
- Visual progress bars

**👤 Profile & ⚙️ Settings**
- Editable profile, theme preferences, secure logout

</td>
</tr>
</table>

## 🖥️ Preview

<div align="center">

| Login | Dashboard |
|:---:|:---:|
| ![Login](login.png.png) | ![Dashboard](dashboard.png.png) |

| Weekly Activity | Goal Tracking |
|:---:|:---:|
| ![Activity](activity.png.png) | ![Goals](goals.png.png) |

</div>

## 🛠️ Tech Stack

| Layer | Stack |
|---|---|
| **Frontend** | React 19, Vite, React Router, Axios, CSS |
| **Backend** | Spring Boot 3, Spring Security, JWT, Maven |
| **Database** | MySQL |
| **Deployment** | Vercel (frontend) · Render (backend) |

## 🚀 Getting Started

```bash
# Clone
git clone https://github.com/Nicode2707/FitZen-Pro.git

# Frontend
cd FitZen-Pro/Frontend/fitzen-frontend
npm install
npm run dev

# Backend (in a new terminal)
cd FitZen-Pro/backend/fitzen-backend
mvn spring-boot:run
```

Set your MySQL credentials and JWT secret in `application.properties` (backend) and your API base URL in `.env` (frontend) before running.

## 🌐 Live Demo

- **Frontend:** [fit-zen-pro.vercel.app](https://fit-zen-pro.vercel.app)
- **Backend API:** [fitzen-pro.onrender.com](https://fitzen-pro.onrender.com)

## 👨‍💻 Author

**Niraj Kumar** — Java Developer, JIS College of Engineering
[GitHub @Nicode2707](https://github.com/Nicode2707)

<div align="center">

⭐ **If FitZen Pro helped you, consider giving it a star!** ⭐

</div>
