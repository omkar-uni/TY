import pandas as pd
import matplotlib.pyplot as plt 
import numpy as np
import scipy.stats as s
df=pd.read_csv("Iris.csv")
print(df.sample(10))
print(df)
print(df.dtypes)
print("Min and max value speal Length")
print(max(df['SepalLengthCm']))
print(min(df['SepalLengthCm']))
print("Min and max value speal Length")
print(max(df['PetalLengthCm']))
print(min(df['PetalLengthCm']))
print("\n")
print(df.info())
print("\n")
print("mean")
print("SepalLength Mean ",s.tmean(df['SepalLengthCm']).round(2))
print("Sepalwidth Mean ",s.tmean(df['SepalWidthCm']).round(2))
print("PetalLength Mean ",s.tmean(df['PetalLengthCm']).round(2))
print("PetalWidth Mean ",s.tmean(df['PetalWidthCm']).round(2))
print("\n")
print("Median")
print("\n")
print("SepalLength Median ",np.median(df['SepalLengthCm']).round(2))
print("Sepalwidth Median ",np.median(df['SepalWidthCm']).round(2))
print("PetalLength Median ",np.median(df['PetalLengthCm']).round(2))
print("PetalWidth Median ",np.median(df['PetalWidthCm']).round(2))

