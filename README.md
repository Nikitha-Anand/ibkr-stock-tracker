<h1 align="center">IBKR Stock Tracker</h1>

<p align="center">
  Real-time stock tracking backend powered by Interactive Brokers (IBKR) API, with a browser extension frontend.<br/>
  Built with <strong>Spring Boot</strong> and <strong>React</strong>, and deployed on <strong>AWS</strong>.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-blue.svg" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.0-success" />
  <img src="https://img.shields.io/badge/React-Frontend-blue" />
  <img src="https://img.shields.io/badge/IBKR%20API-integrated-yellow" />
  <img src="https://img.shields.io/badge/Deployed-AWS-orange" />
</p>

---

## Project Overview

**IBKR Stock Tracker** is a full-stack stock monitoring system that fetches real-time market data (LTP, Open, and Close) from the Interactive Brokers (IBKR) TWS API, and displays it in a browser extension UI.

### Backend:
- Built with **Java 21 + Spring Boot**
- Connects to **IBKR TWS** to pull real-time data
- Provides **RESTful APIs** for integration

### Frontend:
- Browser extension built with **React**
- Based on the template : [react-extension-sidepanel-template](https://github.com/SagaOfAGuy/react-extension-sidepanel-template)

### Deployment:
- Deployed on **AWS** for scalable access and live use

---

## Tech Stack

| Layer         | Technology                                    |
|---------------|-----------------------------------------------|
| Backend       | Java 17, Spring Boot                          |
| IBKR API      | TWS Java API                                  |
| Frontend      | React + Chrome Extension                      |
| Template      | [SagaOfAGuy/react-extension-sidepanel-template](https://github.com/SagaOfAGuy/react-extension-sidepanel-template) |
| Build Tool    | Maven                                         |
| Deployment    | AWS                                           |

---

## How to Run

### Prerequisites

- Java 21
- Maven
- IBKR Trader Workstation (TWS)
- IBKR account (paper or live)
- Node.js (for frontend)
- AWS CLI (for deployment)

### Backend Setup

- ```bash
  git clone https://github.com/Nikitha-Anand/ibkr-stock-tracker.git
  cd ibkr-stock-tracker
  mvn clean install
  mvn spring-boot:run

Ensure TWS is running with API enabled (default port 7497 for paper).

### Frontend Setup

- ```bash
  cd frontend
  npm install
  npm run build
  
In your browser, go to manage extensions and turn on developer mode. Then, load the extension into your browser from the dist\ directory as an unpacked extension.

---

## API Endpoints

| Method        | Endpoint                | Description               |
|---------------|-------------------------|---------------------------|
| GET           | /api/stocks/{symbol}    | Get real-time stock data  |

### Example JSON Response:

{"ltp":1217.1, "open":1217.5, "close":1217.5, "symbol":"AXISBANK"}

---

## Features

- Live market data via IBKR API

- LTP, Open, Close for tracked symbols (Stocks in NSE : SBIN, TCS, INFY, HDFCBANK, RELIANCE)

- REST API for frontend use

- Chrome Extension to view data directly

---

## Future Plans

 - Store Historical Data in AWS RDS / DynamoDB

 - Add authentication for production use

 - Build customizable watchlists

 - Add notifications (e.g., threshold alerts) using AWS SNS

---

## Contributing

Contributions are welcome! If you find a bug or want to improve something, please open an issue or submit a pull request.

---

<div style="border: 1px solid #f5c6cb; background-color: #f8d7da; color: #721c24; padding: 1em; border-radius: 6px; margin-top: 2em;">
  <strong>⚠️ Disclaimer:</strong> 
  <em>This project is intended for educational and experimental use only. Use with your IBKR account at your own discretion and ensure compliance with trading regulations and IBKR’s API usage guidelines.</em>
</div>
