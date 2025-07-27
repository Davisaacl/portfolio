# 🚇 London Transport Data Analysis (TfL Journeys)

This project analyzes transportation patterns in London using historical journey data provided by Transport for London (TfL). The analysis is performed using SQL queries on Snowflake and visualized in Jupyter Notebook.

![Tower Bridge](images/london.jpg)

---

## 📌 Objective

The goal of this project is to identify usage trends and insights across different modes of transport in London, including the Tube, Buses, and Emirates Airline. By querying and visualizing this data, we aim to answer questions such as:

- What are the most and least popular transport modes over time?
- Which months or years show unusual journey patterns?
- How has the Emirates Airline evolved in usage?

---

## 📊 Dataset

The dataset (`tfl_journeys_final.csv`) includes monthly journey counts (in millions) by transport type, spanning multiple years.

| Column Name         | Description                           |
|---------------------|---------------------------------------|
| YEAR                | Year of the journeys                  |
| MONTH               | Month of the journeys                 |
| JOURNEY_TYPE        | Type of transport (Tube, Bus, etc.)   |
| JOURNEYS_MILLIONS   | Number of journeys in millions        |

---

## 🧰 Tools Used

- 🐍 Python
- 📘 Jupyter Notebook
- ❄️ Snowflake SQL (via DataCamp platform)
- 📊 Pandas, Matplotlib (for optional visualizations)
- 📸 Visual context via local images

---

## 📈 Key Queries Performed

- Most popular transport types overall.
- Year-over-year comparison of journeys.
- Analysis of Emirates Airline journey volume.
- Identification of the least-used years per transport mode.

---

## 🔍 Sample Insights

> The London Underground remains the most used mode of transport, but Emirates Airline journeys have varied significantly across months. Bus usage shows a gradual decline after 2019, possibly linked to COVID-19 disruptions.

---

## 📁 Folder Structure
tfl-london-transport-analysis/
├── data/
│ └── tfl_journeys_final.csv
├── images/
│ ├── london.jpg
│ └── tube.jpg
├── notebook.ipynb
├── README.md
└── requirements.txt
