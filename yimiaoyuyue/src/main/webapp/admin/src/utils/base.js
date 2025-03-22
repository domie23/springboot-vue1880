const base = {
    get() {
        return {
            url : "http://localhost:8080/yimiaoyuyue/",
            name: "yimiaoyuyue",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yimiaoyuyue/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "疫苗预约系统"
        } 
    }
}
export default base
