import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    subset = employees[0:3]
    return subset