select id,
sum(if(month = 'Jan',revenue,NULL)) as Jan_Revenue,
sum(if(month = 'feb',revenue,NULL)) as feb_Revenue,
sum(if(month = 'mar',revenue,NULL)) as mar_Revenue,
sum(if(month = 'apr',revenue,NULL)) as apr_Revenue,
sum(if(month = 'may',revenue,NULL)) as may_Revenue,
sum(if(month = 'jun',revenue,NULL)) as jun_Revenue,
sum(if(month = 'jul',revenue,NULL)) as jul_Revenue,
sum(if(month = 'aug',revenue,NULL)) as aug_Revenue,
sum(if(month = 'sep',revenue,NULL)) as sep_Revenue,
sum(if(month = 'oct',revenue,NULL)) as oct_Revenue,
sum(if(month = 'nov',revenue,NULL)) as nov_Revenue,
sum(if(month = 'dec',revenue,NULL)) as dec_Revenue
from Department
group by id;