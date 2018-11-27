var gulp = require ('gulp'),
    sass = require ('gulp-sass'),
    browserSync = require ('browser-sync'),
    watch = require('gulp-watch');

gulp.task ('serve',['sass'], function () {
    browserSync.init({
        server: {
            baseDir: 'src/'
        }
    });
    gulp.watch('src/content/css/scss/**/*.scss',['sass']).on('change', browserSync.reload);
    gulp.watch('src/views/*.html').on('change', browserSync.reload);
});

gulp.task ('sass', function () {
    return gulp.src('src/content/css/scss/main.scss')
    .pipe(sass().on('error', sass.logError))
    .pipe(gulp.dest("src/content/css/"))
    .pipe(browserSync.stream());
});